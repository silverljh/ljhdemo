package com.example.demo.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private int age;
    private String password;
    private String userphone;
    private String token;
}