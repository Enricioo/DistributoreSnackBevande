package org.generation.italy.model;

public class Prodotto {
		
	private String nome;
	private float costo;
	private int quantita;
	
	public Prodotto (String nome, float costo, int quantita) {
		this.nome = nome;
		this.costo = costo;
		this.quantita = quantita;
	}

	public String getNome() {
		return nome;
	}

	public float getCosto() {
		return costo;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	
	
}
