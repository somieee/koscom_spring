package com.example.iocexam.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private String email;
    private String name;
    private String password;
}
