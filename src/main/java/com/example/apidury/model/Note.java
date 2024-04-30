package com.example.apidury.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Data
@Document
@JsonIgnoreProperties(ignoreUnknown = true)
public class Note {
    @Id
    private String id;
    private String note;
    private int priority;
    private Category category;
    private Notification notification;

    public Note(){}

    public Note(String note, int priority, Category category) {
        this.note = note;
        this.priority = priority;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
