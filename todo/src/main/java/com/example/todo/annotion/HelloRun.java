package com.example.todo.annotion;

import java.lang.reflect.Method;

public class HelloRun {

  public static void main(String[] args)
    throws NoSuchMethodException, SecurityException {
    Hello hello = new Hello();

    Method method = hello.getClass().getDeclaredMethod("hi");

    if (method.isAnnotationPresent(Count100.class)) {
      for (int i = 0; i < 100; i++) {
        hello.hi();
      }
    } else hello.hi();
  }
}
