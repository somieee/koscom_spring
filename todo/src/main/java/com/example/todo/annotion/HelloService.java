package com.example.todo.annotion;

public class HelloService {

  @Print
  public void method1() {
    System.out.println("method1");
  }

  @Print("&&")
  public void method2() {
    System.out.println("method2");
  }

  @Print(value = "**", number = 10)
  public void method3() {
    System.out.println("method3");
  }
}
