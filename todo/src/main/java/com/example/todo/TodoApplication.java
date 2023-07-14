package com.example.todo;

import com.example.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(TodoApplication.class, args);
  }

  @Autowired
  TodoService todoService;

  @Override
  public void run(String... args) throws Exception {
    // todoService.addTodo("mybatis study!!");
    // todoService.addTodo("spring mvc study!!");

    // List<Todo> todos = todoService.getTodos();

    // for (Todo todo : todos) {
    //   System.out.println(todo);
    // }

    // System.out.println(todoService.getTodo(1L));
    // todoService.deleteTodo(1L);
  }
}
