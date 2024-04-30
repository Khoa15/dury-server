package com.example.apidury.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Document
public class Category {
    @Id
    private String id;
    private String name;
    private String color;
    @DBRef
    private List<Note> categoryNotes;
    @DBRef
    private User user;

    public Category(){}

    public Category(String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
