package com.example.demo.src.user.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private int customerId;
    private String userId;
    private String password;
    private String userName;
    private String email;
    private String phoneNumber;
    private int status;
}
