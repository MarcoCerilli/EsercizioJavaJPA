package com.example.Libreria;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import java.util.List;

@Controller
public class LibroController {

	@Autowired
	private LibroRepository libroRepository;

	@GetMapping("/home")
	public String mostraLibri(Model model) {
		List<Libro> libri = libroRepository.findAll();
		model.addAttribute("libri", libri);
		return "home";
	}

	@GetMapping("/aggiungi")
	public String mostraFormAggiunta(Model model) {
	
		model.addAttribute("libro", new Libro());
		return "aggiungi";
		
	}
	
	@PostMapping("/salva")
		public String salvalibro(@ModelAttribute Libro libro) {
		libroRepository.save(libro);
		return "redirect:/home";
	}
	
	
	@GetMapping("/elimina/{id}")
	public String eliminaLibro(@PathVariable Integer id) {
		libroRepository.deleteById(id);
		return "redirect:/home";
	}
	
}






