package com.todo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

	public Optional<User> findByUserName(String username);
}

