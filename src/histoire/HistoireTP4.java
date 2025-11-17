package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

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
		
		System.out.println("//////////////////////////////////////////////////////////////");
		
		//////////////////////////////////////////////////////////////////////////////////
		///									Commercant 								   ///
		//////////////////////////////////////////////////////////////////////////////////
	
		Commercant marco = new Commercant("Marco", 20);

		// Scénario demandé
		marco.direBonjour();

		// Marco se fait extorquer
		marco.seFaireExtorquer();

		// Marco reçoit 15 sous
		marco.recevoir(15);

		// Marco boit son thé
		marco.boire();
		
		System.out.println("//////////////////////////////////////////////////////////////");
		
		//////////////////////////////////////////////////////////////////////////////////
		///									Yakuza 								       ///
		//////////////////////////////////////////////////////////////////////////////////
		
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

		yaku.direBonjour();
		yaku.extorquer(marco);
		
		System.out.println("//////////////////////////////////////////////////////////////");
		
		//////////////////////////////////////////////////////////////////////////////////
		///									Ronin 								   	   ///
		//////////////////////////////////////////////////////////////////////////////////

		Ronin roro = new Ronin("Roro", "shochu", 60);

		roro.direBonjour();
		roro.donner(marco);
	}
}