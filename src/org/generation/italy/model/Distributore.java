package org.generation.italy.model;

public class Distributore {

	
	private double credito;
	private Prodotto elencoProdotti[];

	
	// Dichiarazione del costruttore
	public Distributore () {
		this.credito = 0;
		this.elencoProdotti = new Prodotto[] {
				new Bevanda ("Acqua", 1, 20, false),
				new Bevanda ("Coca-cola", 1.80f, 5, true),
				new Bevanda ("Fanta", 1.50f, 15, true),
				new Snack ("Patatine Paprika", 1.20f, 8, 80),
				new Snack ("Oreo", 0.70f, 12, 70),
				new Snack ("Milka", 0.80f, 14, 60)
			};
		}
	
	// Metodo per inserimento moneta
	public void inserisciMoneta(double monetaInserita) {
		if (monetaInserita == 0.10 || monetaInserita == 0.20 || monetaInserita == 0.50 || monetaInserita == 1 || monetaInserita == 2) {
			credito += monetaInserita;
			System.out.println("Inserimento moneta da: " + monetaInserita + "€");
		} else {
			System.out.println("Moneta non valida");
		}
	}

	// Metodo per erogazione prodotto
	public void erogaProdotto (int nrProdotto) {
		
		if (nrProdotto < 0 || nrProdotto >= elencoProdotti.length) {
			System.out.println("Prodotto non valido");
			return;
		}
		
		Prodotto prodotto = elencoProdotti[nrProdotto];
		if (prodotto.getQuantita() == 0) {
			System.out.println("Il prodotto è esaurito");
			return;
		}
		
		if (credito >= prodotto.getCosto()) {
			// Sottrazione credito e quantità
			credito -= prodotto.getCosto();
			prodotto.setQuantita(prodotto.getQuantita() - 1);
		 
			// Verifica se è una bevanda o uno snack
			if (prodotto instanceof Bevanda) {
				Bevanda bevanda = (Bevanda) prodotto;
				String zuccherata = bevanda.isZuccherata() ? "zuccherata" : "non zuccherata";
				System.out.println("Bevanda: " + bevanda.getNome() + " erogata correttamente" + "\nTipologia: " + zuccherata);
			} else if (prodotto instanceof Snack) {
				Snack snack = (Snack) prodotto;
				System.out.println("Snack " + snack.getNome() + " erogato correttamente" + "\nGrammi: " + snack.getGrammi());
			} 
		} else {
			System.out.println("Credito insufficiente");
		}
	}
	
	// Metodo per visualizzazione prodotto
	public void visualizzaProdotti() {
		System.out.println("Elenco prodotti: ");
		for (int i = 0; i < elencoProdotti.length; i++) {
			Prodotto prodotto = elencoProdotti[i];
			if (prodotto instanceof Bevanda) {
				Bevanda bevanda = (Bevanda) prodotto;
				String zuccherata = bevanda.isZuccherata() ? "zuccherata" : "non zuccherata";
				System.out.println( i + ": " + bevanda.getNome() + " Tipologia: " + zuccherata + " Costo: " + bevanda.getCosto() + " Quantità: " + bevanda.getQuantita());
			} else if (prodotto instanceof Snack) {
				Snack snack = (Snack) prodotto;
				System.out.println(i + ": " + snack.getNome() + " Grammi: " + snack.getGrammi() + " Costo: " + snack.getCosto() + " Quantità: " + snack.getQuantita());				
			} 
			
		}
	}
	
	// Metodo per erogazione resto
	public void erogaResto() {
		System.out.println("Erogazione resto di: " + String.format("%.2f", credito) + "€");
		credito = 0;
	}
	
	// Metodo per mostrare credito
	public void getCredito() {
		System.out.println("Credito residuo: " + String.format("%.2f", credito) + "€");
	}
	
}
