package personnages;

public class Yakuza extends Humain {

    // Attributs suppl�mentaires : clan et r�putation
    private String clan;
    private int reputation;

    // Constructeur
    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);  // Appel du constructeur de la classe Humain
        this.clan = clan;
        this.reputation = 0;  // R�putation par d�faut de 0
    }

    // M�thode pour extorquer un commer�ant
    public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
        parler("Marco, si tu tiens � la vie, donne-moi ta bourse !");
        int argentExtorque = victime.seFaireExtorquer();  // Le yakuza extorque tout l'argent du commer�ant
        gagnerArgent(argentExtorque);  // Le yakuza r�cup�re l'argent extorqu�
        reputation++;  // Augmentation de la r�putation du yakuza
        parler("J'ai piqu� les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    // Accesseur pour obtenir la r�putation du yakuza
    public int getReputation() {
        return reputation;
    }

    // Accesseur pour obtenir le clan du yakuza
    public String getClan() {
        return clan;
    }
}
