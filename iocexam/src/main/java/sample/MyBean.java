package sample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
// @NoArgsConstructor
@ToString
public class MyBean {
    private String name;
    private int count;

    public MyBean(){
        System.out.println("MyBean 생성!!");
    }
    
    
}
