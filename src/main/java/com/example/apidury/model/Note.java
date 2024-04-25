package com.example.apidury.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
public class Note {
    private Long id;
    private String note;
    private short priority;
    private Category category;

    public Note(){}

    public Note(long id, String note, Category category) {
        this.id = id;
        this.note = note;
        this.category = category;
    }



}
