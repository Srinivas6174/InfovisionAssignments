package com.todolist.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.todo.entity.Todo;
import com.todo.entity.User;
import com.todo.repo.TodoRepository;
import com.todo.repo.UserRepo;

public class TodoController {

	@Autowired
	UserRepo userRepo;

	@Autowired
	TodoRepository todoRepo;
	
	@PostMapping("/newUser")
	public ResponseEntity<?> createUser(@RequestBody User user){
		if(userRepo.findByUserName(user.getUserName()).isPresent()) {
			return ResponseEntity.status(200).body("User name already exists");
		}
		userRepo.save(user);
		return ResponseEntity.status(200).body(user);
	}

	@PostMapping("/{username}")
	public ResponseEntity<?> addTodo(@PathVariable String username,@RequestBody Todo todoItem) {
		User user = userRepo.findByUserName(username)
				.orElseThrow(() -> new RuntimeException("User not found"));
		todoItem.setUser(user);
		Todo todowork = todoRepo.save(todoItem);
		return ResponseEntity.ok(todoItem);
	}
	@GetMapping("/users/{userId}/todos")
	public ResponseEntity<?> getTodos(@PathVariable Long userId) {
		if (!userRepo.existsById(userId)) {
			return ResponseEntity.badRequest().body("User not found");
		}
		List<Todo> todos = todoRepo.findByUserUserId(userId);
		return ResponseEntity.ok(todos);
	}

	// Delete TODO by id
	@DeleteMapping("/todos/{todoId}")
	public ResponseEntity<?> deleteTodo(@PathVariable Long todoId) {
		if (!todoRepo.existsById(todoId)) {
			return ResponseEntity.badRequest().body("Todo not found");
		}
		todoRepo.deleteById(todoId);
		return ResponseEntity.ok("todo deleted:\n id: "+todoId);
	}

	@PutMapping("/todos/{todoId}")
	public Optional<ResponseEntity<Todo>> updateTodo(@PathVariable Long todoId, @RequestBody Todo updatedTodo) {
		return todoRepo.findById(todoId).map(todo->{todo.setTodo(updatedTodo.getTodo());
					                         todoRepo.save(todo);
											 return ResponseEntity.ok(todo);
		                                     });
	}

}
