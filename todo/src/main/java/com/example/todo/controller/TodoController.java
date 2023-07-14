package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @GetMapping("/list")
  // @ResponseBody
  public String hi(String name, Model model) {
    System.out.println("hi~~~~!!!!!!!!!!!!!!");
    model.addAttribute("name", name);
    return "list";
  }

  @GetMapping("/")
  @ResponseBody
  public String tt() {
    return "test";
  }
}
