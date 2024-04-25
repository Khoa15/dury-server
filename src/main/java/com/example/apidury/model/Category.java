package com.example.apidury.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Category {
    private String id;
    private String name;
    private String color;

    private ArrayList<Note> categoriedNotes = new ArrayList<Note>();

    public Category(){}

    public Category(String id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
