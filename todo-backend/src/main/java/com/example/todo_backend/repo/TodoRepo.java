// Intéragir avec la base de données
package com.example.todo_backend.repo;

import com.example.todo_backend.model.TodoItem;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}