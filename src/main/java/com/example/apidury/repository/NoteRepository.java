package com.example.apidury.repository;

import com.example.apidury.model.Note;
import org.springframework.stereotype.Repository;

public interface NoteRepository extends CrudRepository<Note, String> {


}
