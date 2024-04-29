package com.example.apidury;

import com.example.apidury.model.Category;
import com.example.apidury.model.Note;
import com.example.apidury.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiDuryApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApiDuryApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(NoteRepository noteRepository){
		return args -> {
			Category category = new Category(
					"English",
					"#9ded64"
			);
			Note note = new Note(
				"Ghi chú",
					1,
					category
			);

			noteRepository.insert(note);
		};
	}
}
