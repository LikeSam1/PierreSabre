package histoire;

import personnages.Commercant;
import personnages.GrandMere;
import personnages.Ronin;
import personnages.Yakuza;
import personnages.Samourai;
import personnages.Traitre;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);

		marco.listerConnaissances();
		roro.listerConnaissances();
		yaku.listerConnaissances();
		
		///////////////SAMOURAI////////////////////
		
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 80);

		akimoto.direBonjour();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissances();

		akimoto.boire("thé");
		
		///////////////TRAITRE////////////////////
		
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);


		masako.faireLeGentil();

		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);

		akimoto.direBonjour();

		//Masako se présente (niveau traîtrise = 3)
		masako.direBonjour();

		//Il ne peut plus rançonner personne
		masako.ranconner(marco);

		masako.direBonjour();

		masako.faireConnaissanceAvec(yaku); // il faut qu'il connaisse Yaku
		masako.faireConnaissanceAvec(akimoto); // et Akimoto
		masako.faireLeGentil();

		masako.direBonjour();

		roro.direBonjour();
		
		///////////////GRAND-MERE////////////////////
		
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
		System.out.println("");
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);

		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);

		grandMere.ragoter();
	}
}
