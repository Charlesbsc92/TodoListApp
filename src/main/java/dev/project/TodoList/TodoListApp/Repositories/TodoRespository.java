package dev.project.TodoList.TodoListApp.Repositories;

import dev.project.TodoList.TodoListApp.Models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRespository extends JpaRepository<Todo, Long> {

}
