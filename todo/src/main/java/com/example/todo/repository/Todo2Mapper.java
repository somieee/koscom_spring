package com.example.todo.repository;

import com.example.todo.domain.Todo;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Todo2Mapper {
  @Select("SELECT id, todo, done FROM todos ORDER BY id DESC")
  List<Todo> findAll();

  @Insert("INSERT INTO todos (todo, done) VALUES (#{todo}, #{done})")
  @Options(useGeneratedKeys = true, keyProperty = "id")
  void insertTodo(Todo todo);

  @Select("SELECT id, todo, done FROM todos WHERE id = #{id}")
  Todo findById(Long id);

  @Update("UPDATE todos SET todo = #{todo}, done = #{done} WHERE id = #{id}")
  void updateTodo(Todo todo);

  @Delete("DELETE FROM todos WHERE id = #{id}")
  void deleteTodo(Long id);

  @Select(
    "SELECT id, todo, done FROM todos ORDER BY id DESC LIMIT #{limit} OFFSET #{offset}"
  )
  List<Todo> findAllWithPaging(
    @Param("limit") int limit,
    @Param("offset") int offset
  );
}
