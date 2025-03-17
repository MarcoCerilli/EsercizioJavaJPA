package com.example.Libreria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/libri")

public class LibroRestController {

	@Autowired
	private LibroRepository libroRepository;

	@PostMapping("/aggiungi")

	public Libro aggiungiLibro(@RequestBody Libro libro) {
		return libroRepository.save(libro);

	}

}
