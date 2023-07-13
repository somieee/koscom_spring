package com.example.todo.service;

import com.example.todo.domain.Todo;
import com.example.todo.repository.TodoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class TodoService {

  private final TodoMapper todoMapper;

  @Transactional
  public Todo addTodo(String strTodo) {
    Todo todo = new Todo();
    todo.setTodo(strTodo);
    todo.setDone(false);
    todoMapper.insertTodo(todo);
    return todo;
  }
}
