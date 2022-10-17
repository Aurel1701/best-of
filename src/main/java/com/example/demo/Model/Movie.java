package com.example.demo.Model;

import java.util.ArrayList;

public class Movie {
	private String titolo;
	private int anno;
	private String regista;
	private ArrayList<String>cast =  new ArrayList<String>();
	
	public Movie () {
		titolo = "HunterxHunter";
		anno = 2000;
		regista = "Zlatan";
		cast.add("Neymar");
		cast.add("Messi");
		cast.add("Mbappe");
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public ArrayList<String> getCast() {
		return cast;
	}

	public void setCast(ArrayList<String> cast) {
		this.cast = cast;
	}
	

}
