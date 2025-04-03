package personnages;

public class Yakuza extends Humain {

    // Attributs supplémentaires : clan et réputation
    private String clan;
    private int reputation;

    // Constructeur
    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);  // Appel du constructeur de la classe Humain
        this.clan = clan;
        this.reputation = 0;  // Réputation par défaut de 0
    }

    // Méthode pour extorquer un commerçant
    public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler("Marco, si tu tiens à la vie, donne-moi ta bourse !");
        int argentExtorque = victime.seFaireExtorquer();  // Le yakuza extorque tout l'argent du commerçant
        gagnerArgent(argentExtorque);  // Le yakuza récupère l'argent extorqué
        reputation++;  // Augmentation de la réputation du yakuza
        parler("J'ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    // Accesseur pour obtenir la réputation du yakuza
    public int getReputation() {
        return reputation;
    }

    // Accesseur pour obtenir le clan du yakuza
    public String getClan() {
        return clan;
    }
}
