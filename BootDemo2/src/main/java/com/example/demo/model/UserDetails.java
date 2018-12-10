package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDetails {

    private String tenantId;
    private String username;

    public UserDetails(String tenantId, String username, String password) {
        this.tenantId = tenantId;
        this.username = username;
        this.password = password;
    }

    private String password;


}
