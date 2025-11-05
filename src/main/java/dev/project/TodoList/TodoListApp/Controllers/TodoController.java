package dev.project.TodoList.TodoListApp.Controllers;

import dev.project.TodoList.TodoListApp.Models.Todo;
import dev.project.TodoList.TodoListApp.Services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

    @Autowired
    TodoService service;

    @PostMapping("/create")
    ResponseEntity<Todo> createTodoItem(@RequestBody Todo item) {
        return new ResponseEntity<Todo>(service.createTodo(item), HttpStatus.CREATED);
    }
}
