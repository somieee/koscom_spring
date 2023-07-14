package com.example.todo.controller;

import com.example.todo.domain.Todo;
import com.example.todo.service.TodoService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
@RequiredArgsConstructor
public class TodoController {

  private final TodoService todoService;

  @GetMapping
  public String todo() {
    return "todo";
  }

  @GetMapping("/list")
  public String list(Model model) {
    List<Todo> todos = todoService.getTodos();
    model.addAttribute("todoList", todos);
    return "list";
  }

  @GetMapping("/update")
  public String update(@RequestParam("id") Long id) {
    todoService.updateTodo(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/delete")
  public String delete(@RequestParam("id") Long id) {
    todoService.deleteTodo(id);
    return "redirect:/todo/list";
  }

  @PostMapping("/add")
  public String add(@RequestParam("todo") String todo) {
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/add")
  @ResponseBody
  public String add2() {
    return "test111";
  }
  // @GetMapping("/")
  // @ResponseBody
  // public String tt() {
  //   return "test";
  // }
}
