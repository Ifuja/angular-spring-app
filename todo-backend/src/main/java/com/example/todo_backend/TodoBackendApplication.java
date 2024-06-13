package com.example.todo_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.example.todo_backend.model.TodoItem;

@SpringBootApplication
public class TodoBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoBackendApplication.class, args);

		//TodoItem item6 = new TodoItem(6, "Faire la lessive", true);

		//System.out.println("Item 6: " + item6.getTitle() + ", Completed: " + item6.isCompleted());
	}

}
