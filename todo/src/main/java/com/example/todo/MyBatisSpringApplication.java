package com.example.todo;

import com.example.todo.service.TodoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyBatisSpringApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = new AnnotationConfigApplicationContext(
      "com.example.todo.config",
      "com.example.todo.service"
    );
    TodoService todoService = ctx.getBean(TodoService.class);

    todoService.addTodo("수박사기");
    todoService.addTodo("고구마사기");
  }
}
