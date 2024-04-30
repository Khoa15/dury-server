package com.example.apidury.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Data
public class User {
    @Id
    private String id;
    @Indexed(unique = true)
    private String username;
    private String password;
    @DBRef
    List<Category> listCategories;
    public User(){}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
