package com.example.aopexam.aop;

import com.example.aopexam.domain.Product;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyFirstAspect {

  @Pointcut("execution(* com.example..*Impl.add*(..))")
  private void pc() {}

  @Pointcut("execution(* findProduct(String))")
  private void pc2() {}

  @Before("pc()")
  public void before(JoinPoint jp) {
    System.out.println("Hello~~~ Before ######");

    Signature sig = jp.getSignature();
    System.out.println("::::::::" + sig.getName());

    Object[] args = jp.getArgs();
    for (Object object : args) {
      System.out.println(":::::::: 인자::" + object);
    }
  }

  @After("pc()")
  public void after() {
    System.out.println("Hello~~~  @After!!");
  }

  @AfterReturning(value = "pc2()", returning = "product")
  public void afterReturning(JoinPoint jp, Product product) {
    System.out.println("Hello~~~~     AfterReturning #######");
    //예외없이 메소드가 실행되었을 때만 동작됨..

    Signature sig = jp.getSignature();
    System.out.println("::::::::" + sig.getName());

    Object[] args = jp.getArgs();
    for (Object object : args) {
      System.out.println(":::::::: 인자::" + object);
    }

    product.setName("new pen!!!!");
    product.setPrice(product.getPrice() + 2000);
  }

  @AfterThrowing(value = "pc2()", throwing = "ex")
  public void afterThrowing(Throwable ex) {
    System.out.println("Hello AfterThrowing #### 예외가 발생될때만 동작됨.");
    System.out.println("exception value :::: " + ex);
  }

  @Around("pc2()")
  public Product around(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("Hello Around ########  메서드 실행전에 동작!!");

    Product product = (Product) pjp.proceed(); //실제 핵심관심( target ) 실행

    System.out.println("Hello Around ########  메소드 실행 후 동작!!");

    product.setPrice(product.getPrice() - 1000);

    return product;
  }
}
