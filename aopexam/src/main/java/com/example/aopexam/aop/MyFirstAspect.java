package com.example.aopexam.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyFirstAspect {

  @Before("execution(* com.example..*Impl.add*(..))")
  public void before(JoinPoint jp) {
    System.out.println("Hello~~~ Before ######");

    Signature sig = jp.getSignature();
    System.out.println("::::::::" + sig.getName());

    Object[] args = jp.getArgs();
    for (Object object : args) {
      System.out.println(":::::::: 인자::" + object);
    }
  }
}
