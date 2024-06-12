package org.generation.italy.model;

public class Bevanda extends Prodotto {

	private boolean zuccherata;
	
	public Bevanda (String nome, float costo, int quantita, boolean zuccherata) {
		super(nome, costo, quantita);
		this.zuccherata = zuccherata;
	}

	public boolean isZuccherata() {
		return zuccherata;
	}
		
}
