package com.example.todo.controller;

import com.example.todo.domain.Todo;
import com.example.todo.service.TodoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/todos")
@RequiredArgsConstructor
public class TodoApiController {

  private final TodoService todoService;

  @GetMapping
  public List<Todo> getTodos() {
    return todoService.getTodos();
  }

  @GetMapping("/{id}")
  public Todo getTodo(@PathVariable("id") Long id) {
    return todoService.getTodo(id);
  }

  @PostMapping
  public Todo addTodo(@RequestBody Todo todo) {
    return todoService.addTodo(todo.getTodo());
  }

  @PatchMapping
  public Todo updateTodo(@RequestBody Todo todo) {
    System.out.println(todo);
    return todoService.updateTodo(todo.getId());
  }

  @DeleteMapping("/{id}")
  public String deleteTodo(@PathVariable("id") Long id) {
    todoService.deleteTodo(id);
    return "ok!!";
  }
}
