package com.example.todo.repository;

import com.example.todo.domain.Todo;
import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface Todo2Mapper {
  @Select("SELECT id, todo, done FROM todos ORDER BY id DESC")
  List<Todo> findAll();
}
