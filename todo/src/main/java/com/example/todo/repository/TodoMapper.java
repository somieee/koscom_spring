package com.example.todo.repository;

import com.example.todo.domain.Todo;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TodoMapper {
  void insertTodo(Todo todo);
  List<Todo> findAll();
  Todo findById(Long id);

  void updateTodo(Todo todo);

  void deleteTodo(Long id);

  List<Todo> findAllWithPaging(
    @Param("limit") int limit,
    @Param("offset") int offset
  );
}
