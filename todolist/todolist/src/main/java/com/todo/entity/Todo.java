package com.todo.entity;

import jakarta.persistence.*; // or use javax.persistence.* depending on your setup
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String todo;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonIgnoreProperties("todos") // Match the actual property in User entity
    private User user;

    // Constructors
    public Todo() {}

    public Todo(Long id, String todo) {
        this.id = id;
        this.todo = todo;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
