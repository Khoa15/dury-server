package com.example.apidury.controller;
import com.example.apidury.model.Note;
import com.example.apidury.repository.NoteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {
    private NoteRepository noteRepository;
    @GetMapping("/note")
    public List<Note> getAllNotes(){
        List<Note> notes = (List<Note>) noteRepository.findAll();
        return notes;
    }

    @PostMapping("/note")
    public Note addNote(@RequestBody Note note){
        
        return note;
    }

}
