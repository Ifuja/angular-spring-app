// Contient les requêtes HTTP
package com.example.todo_backend.controller;

import com.example.todo_backend.model.TodoItem;
import com.example.todo_backend.repo.TodoRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoRepo todoRepo;
    
    /** CRUD (Create, Read, Update, Delete) **/

    // Renvoie la liste de tous les éléments
    @GetMapping
    public List<TodoItem> findAll() {
        return todoRepo.findAll();
    }

    // Crée un nouvel élément 
    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
        return todoRepo.save(todoItem);
    }

    // Met à jour un élèment
    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        TodoItem todo = todoRepo.findById(id).orElseThrow();
        todo.setTitle(todoItem.getTitle());
        todo.setCompleted(todoItem.isCompleted());
        return todoRepo.save(todo);
    }

    // Supprime un élèment
    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        todoRepo.deleteById(id);
    }
}