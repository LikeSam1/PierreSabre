package histoire;

import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
    public static void main(String[] args) {
        // Création d'un humain
        Humain prof = new Humain("Prof", "kombucha", 54);

        // Test des méthodes
        prof.direBonjour();  // Bonjour ! Je m'appelle Prof et j'aime boire du kombucha.
        
        // Prof achète une boisson
        prof.acheter("boisson", 12);  // J'ai 42 sous en poche. Je vais pouvoir m'offrir une boisson à 12 sous.
        prof.boire();  // Mmmm, un bon verre de kombucha ! GLOUPS !

        // Prof achète un jeu
        prof.acheter("jeu", 2);  // J'ai 40 sous en poche. Je vais pouvoir m'offrir un jeu à 2 sous.

        // Prof essaie d'acheter un kimono
        prof.acheter("kimono", 50);  // Je n'ai plus que 40 sous en poche. Je ne peux même pas m'offrir un kimono à 50 sous.
        
        // Création d'un commerçant avec 20 sous en poche
        Commercant marco = new Commercant("Marco", 20);

        // Marco dit bonjour
        marco.direBonjour();  // (Marco) - Bonjour ! Je m'appelle Marco et j'aime boire du thé.

        // Marco se fait extorquer
        marco.seFaireExtorquer();  // (Marco) - Le monde est vraiment trop injuste !

        // Marco reçoit de l'argent d'un généreux donateur (par exemple 15 sous)
        marco.recevoir(15);  // (Marco) - 15 sous ! Je te remercie généreux donateur!

        // Marco boit son thé
        marco.boire();  // (Marco) - Mmmm, un bon verre de thé ! GLOUPS !
    }
}
