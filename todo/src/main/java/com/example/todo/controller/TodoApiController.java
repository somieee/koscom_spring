package com.example.todo.controller;

import com.example.todo.domain.Todo;
import com.example.todo.service.TodoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
