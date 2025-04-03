package histoire;

import personnages.Humain;

public class HistoireTP4 {
    public static void main(String[] args) {
        // Cr�ation d'un humain
        Humain prof = new Humain("Prof", "kombucha", 54);

        // Test des m�thodes
        prof.direBonjour();  // Bonjour ! Je m'appelle Prof et j'aime boire du kombucha.
        
        // Prof ach�te une boisson
        prof.acheter("boisson", 12);  // J'ai 42 sous en poche. Je vais pouvoir m'offrir une boisson � 12 sous.
        prof.boire();  // Mmmm, un bon verre de kombucha ! GLOUPS !

        // Prof ach�te un jeu
        prof.acheter("jeu", 2);  // J'ai 40 sous en poche. Je vais pouvoir m'offrir un jeu � 2 sous.

        // Prof essaie d'acheter un kimono
        prof.acheter("kimono", 50);  // Je n'ai plus que 40 sous en poche. Je ne peux m�me pas m'offrir un kimono � 50 sous.
    }
}
