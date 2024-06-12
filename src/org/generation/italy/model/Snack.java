package org.generation.italy.model;

public class Snack extends Prodotto {
		
	private int grammi;
	
	public Snack (String nome, float costo, int quantita, int grammi) {
		super(nome, costo, quantita);
		this.grammi = grammi;
	}

	public int getGrammi() {
		return grammi;
	}
	
}
