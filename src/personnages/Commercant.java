package personnages;

public class Commercant extends Humain {

    // Constructeur qui appelle le constructeur de la classe mère Humain
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);  // Le commerçant a toujours comme boisson préférée du thé
    }

    // Méthode pour se faire extorquer
    public int seFaireExtorquer() {
        int argentExtorque = getArgent();  // Utilisation de l'accesseur pour obtenir l'argent
        perdreArgent(argentExtorque);  // On appelle la méthode de la classe Humain pour perdre de l'argent
        parler("Le monde est vraiment trop injuste !");
        return argentExtorque;  // Retourne la somme extorquée
    }

    // Méthode pour recevoir de l'argent d'un ronin
    public void recevoir(int argent) {
        gagnerArgent(argent);  // Utilisation de la méthode de la classe Humain pour gagner de l'argent
        parler("Merci beaucoup, noble ronin. Je vous suis très reconnaissant.");
    }
}
