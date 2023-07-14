package com.example.todo.annotion;

import java.lang.reflect.Method;

public class ServiceRun {

  public static void main(String[] args) throws Exception {
    Method[] declareMethods = HelloService.class.getDeclaredMethods();

    HelloService sercvice = new HelloService();

    for (Method method : declareMethods) {
      if (method.isAnnotationPresent(Print.class)) {
        Print print = method.getAnnotation(Print.class);

        System.out.println("[" + method.getName() + "]");

        for (int i = 0; i < print.number(); i++) {
          System.out.print(print.value());
        }
        System.out.println();
      }

      method.invoke(sercvice);
    }
  }
}
