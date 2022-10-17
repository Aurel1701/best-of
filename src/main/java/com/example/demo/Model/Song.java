package com.example.demo.Model;

public class Song {
	private String genere;
	private int anno;
	private String titolo;
	private String autore;
	private String performer;
	
	public Song () {
		genere = "rap";
		anno = 2019;
		titolo = "Dubbi";
		autore = "Marracash";
		performer = "Marracash";
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
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

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

}
