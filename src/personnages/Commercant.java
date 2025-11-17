package personnages;

public class Commercant extends Humain {

    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int argentExtorque = getArgent();  // Utilisation de l'accesseur pour obtenir l'argent
        perdreArgent(argentExtorque);
        parler("J’ai tout perdu!Le monde est vraiment trop injuste !");
        return argentExtorque;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler(argent + " sous ! Je te remercie généreux donateur");
    }
}
