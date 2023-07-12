package sample.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sample.MyBean;
import sample.config.MyBeanConfig;

public class SpringRun {
    public static void main(String[] args) {
        System.out.println("ApplicationContext 생성 전!!");
        ApplicationContext context 
        = new AnnotationConfigApplicationContext(MyBeanConfig.class);
    
        System.out.println("ApplicationContext 생성 후!!");

       MyBean bean1 =(MyBean) context.getBean("myBean");

       MyBean bean2 = context.getBean("myBean", MyBean.class);

       bean1.setName("kang");

       System.out.println(bean1);
       System.out.println(bean2);

       if(bean1 == bean2)
        System.out.println("동일한 인스턴스입니다.");

        MyBean bean3 = context.getBean("myBean2", MyBean.class);

        System.out.println(bean3);

        if(bean1 == bean3)
            System.out.println("동일한 인스턴스입니다.");
        else
            System.out.println("다른 인스턴스입니다.");

    }  

}
