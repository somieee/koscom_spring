package sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// @NoArgsConstructor
@ToString
@Component
public class MyBean {
    private String name;
    private int count;

    public MyBean(){
        System.out.println("MyBean 생성!!");
    }
    
    
}
