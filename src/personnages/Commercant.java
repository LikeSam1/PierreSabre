package personnages;

public class Commercant extends Humain {

    // Constructeur qui appelle le constructeur de la classe m�re Humain
    public Commercant(String nom, int argent) {
        super(nom, "th�", argent);  // Le commer�ant a toujours comme boisson pr�f�r�e du th�
    }

    // M�thode pour se faire extorquer
    public int seFaireExtorquer() {
        int argentExtorque = getArgent();  // Utilisation de l'accesseur pour obtenir l'argent
        perdreArgent(argentExtorque);  // On appelle la m�thode de la classe Humain pour perdre de l'argent
        parler("Le monde est vraiment trop injuste !");
        return argentExtorque;  // Retourne la somme extorqu�e
    }

    // M�thode pour recevoir de l'argent d'un ronin
    public void recevoir(int argent) {
        gagnerArgent(argent);  // Utilisation de la m�thode de la classe Humain pour gagner de l'argent
        parler("Merci beaucoup, noble ronin. Je vous suis tr�s reconnaissant.");
    }
}
