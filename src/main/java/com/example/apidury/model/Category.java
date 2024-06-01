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

    public Category(String name, String color, String userId) {
        this.name = name;
        this.color = color;
        this.user = new User();
        this.user.setId(userId);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Note> getCategoryNotes() {
        return categoryNotes;
    }

    public void setCategoryNotes(List<Note> categoryNotes) {
        this.categoryNotes = categoryNotes;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }



}
