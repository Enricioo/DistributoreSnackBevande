package org.generation.italy;

import java.util.Scanner;

import org.generation.italy.model.Bevanda;
import org.generation.italy.model.Prodotto;
import org.generation.italy.model.Snack;
import org.generation.italy.model.Distributore;

public class Main {

	public static void main(String[] args) {

		Distributore distributore = new Distributore();
		Scanner sc = new Scanner(System.in);
		int risposta;

//		Bevanda[] elencoProdotti;
//		elencoProdotti[0] = new Bevanda("Aranciata", 1,70, 20, true);

		do {

			distributore.visualizzaProdotti();
			System.out.println();
			distributore.getCredito();
			System.out.println();
			System.out.println("1. Inserisci monete \n2. Eroga prodotto \n3. Eroga resto \n4. Esci");

			risposta = sc.nextInt();
			sc.nextLine();

			switch (risposta) {
			// Inserimento monete
			case 1:
				System.out.println("Inserisci monete: ");
				double monete = sc.nextDouble();
				sc.nextLine();
				distributore.inserisciMoneta(monete);
				break;
			// Selezione del prodotto
			case 2:
				System.out.println("Inserisci numero prodotto: ");
				int nrProdotto = sc.nextInt();
				sc.nextLine();
				distributore.erogaProdotto(nrProdotto);
				break;
			// Eroga resto
			case 3:
				distributore.erogaResto();
				break;
			case 4:
				System.out.println("Uscita in corso...");
				break;
			default:
				System.out.println("Scelta non valida");
			}
		} while (risposta != 4);
	}
}
