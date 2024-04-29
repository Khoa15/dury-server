package com.example.apidury.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
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

    private ArrayList<Note> categoriedNotes = new ArrayList<Note>();

    public Category(){}

    public Category(String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
