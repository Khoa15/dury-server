package com.example.apidury.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document
public class Note {
    @Id
    private String id;
    private String note;
    private int priority;
    private Category category;

    public Note(){}

    public Note(String note, int priority, Category category) {
        this.note = note;
        this.priority = priority;
        this.category = category;
    }
}
