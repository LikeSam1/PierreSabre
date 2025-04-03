package histoire;

import personnages.Humain;
import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
    public static void main(String[] args) {
    	// Cr�ation d'un commer�ant avec 20 sous en poche
        Commercant marco = new Commercant("Marco", 20);

        // Cr�ation d'un yakuza (appartenant au clan Warsong) avec 30 sous en poche
        Yakuza yakuLeNoir = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");

        // Yakuza dit bonjour
        yakuLeNoir.direBonjour();  // (Yaku Le Noir) - Bonjour ! Je m'appelle Yaku Le Noir et j'aime boire du whisky.

        // Yakuza rep�re un commer�ant et l'extorque
        marco.seFaireExtorquer();  // (Marco) - Le monde est vraiment trop injuste !

        // Yakuza extorque Marco
        yakuLeNoir.extorquer(marco);  // (Yaku Le Noir) - J'ai piqu� les 15 sous de Marco, ce qui me fait 45 sous dans ma poche. Hi ! Hi !

        // Yakuza boit son whisky
        yakuLeNoir.boire();  // (Yaku Le Noir) - Mmmm, un bon verre de whisky ! GLOUPS !
    }
}
