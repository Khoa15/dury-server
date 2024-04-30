package com.example.apidury.controller;
import com.example.apidury.model.Note;
import com.example.apidury.repository.NoteRepository;
import com.example.apidury.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notes")
public class NoteController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    public List<Note> getAllNotes(){
        List<Note> notes = (List<Note>) noteService.loadAll();
        return notes;
    }

    @PostMapping
    public Note addNote(@RequestBody Note note){
        return noteService.createNote(note);
    }
}
