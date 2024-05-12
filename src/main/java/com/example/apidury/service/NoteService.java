package com.example.apidury.service;

import com.example.apidury.model.Note;
import com.example.apidury.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;
    public List<Note> loadAll(){
        return noteRepository.findAll();
    }
    public Note createNote(Note note) {
        return noteRepository.save(note);
    }

    public Note updateNote(Note note){
        Optional<Note> notedb = this.noteRepository.findById(note.getId());

        if(notedb.isPresent()){
            Note noteUpdate = notedb.get();
            noteUpdate.setId(note.getId());
            noteUpdate.setNote(note.getNote());
            noteUpdate.setCategory(note.getCategory());
            noteUpdate.setPriority(note.getPriority());
            return noteUpdate;
        }
        else{
            throw new RuntimeException("Note not found!");
        }
    }

    public void deleteNote(Note note){
        try{
            noteRepository.delete(note);
        }catch(Exception e){
            throw new IllegalStateException("Delete have some error!");
        }
    }
}
