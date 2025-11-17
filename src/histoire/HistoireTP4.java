package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);

		// Le scénario demandé
		prof.direBonjour();

		// Achat d'une boisson à 12
		prof.acheter("kombucha", 12);

		// Utilise et déclenche boire
		prof.boire();

		// Achat d'un jeu à 2
		prof.acheter("jeu", 2);

		// Tentative d'achat d'un kimono à 50 (doit échouer)
		prof.acheter("kimono", 50);
	}
}