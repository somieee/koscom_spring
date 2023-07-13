package com.example.todo.service;

import com.example.todo.domain.Todo;
import com.example.todo.repository.Todo2Mapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class Todo2Service {

  private final Todo2Mapper todoMapper;

  @Transactional(readOnly = true)
  public Todo getTodo(Long id) {
    return todoMapper.findById(id);
  }

  @Transactional(readOnly = true)
  public List<Todo> getTodos() {
    return todoMapper.findAll();
  }

  @Transactional
  public Todo addTodo(String strTodo) {
    Todo todo = new Todo();
    todo.setTodo(strTodo);
    todo.setDone(false);
    todoMapper.insertTodo(todo);
    return todo;
  }

  @Transactional
  public Todo updateTodo(Long id) {
    System.out.println("TodoService updateTodo start!!");
    Todo updateTodo = null;
    try {
      updateTodo = todoMapper.findById(id);
      updateTodo.setDone(!updateTodo.isDone());
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("TodoService updateTodo end!!");
    }
    return updateTodo;
  }

  @Transactional
  public void deleteTodo(Long id) {
    Todo result = todoMapper.findById(id);

    if (result == null) return;

    todoMapper.deleteTodo(result.getId());
  }
}
