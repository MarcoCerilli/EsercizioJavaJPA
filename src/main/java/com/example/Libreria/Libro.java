package com.example.Libreria;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "libri")
public class Libro {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	private String titolo;
	private String autore;
	private String editore;

	public Libro() {
		
	}
	public Libro(String titolo, String autore, String editore) {
		super();

		this.titolo = titolo;
		this.autore = autore;
		this.editore = editore;
	}

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
}
	