package dev.project.TodoList.TodoListApp.Services;

import dev.project.TodoList.TodoListApp.Models.Todo;
import dev.project.TodoList.TodoListApp.Repositories.TodoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class TodoService {

    @Autowired
    TodoRespository todoRespository;

    public Todo createTodo(Todo item) {
        return todoRespository.save(item);
    }
}
