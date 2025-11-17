package personnages;

public class Yakuza extends Humain {

    // Attributs supplémentaires : clan et réputation
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
    	parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
        parler("Marco, si tu tiens à la vie, donne-moi ta bourse !");
        int argentExtorque = victime.seFaireExtorquer();
        gagnerArgent(argentExtorque);
        reputation++;
        parler("J'ai piqué les " + argentExtorque + " sous de " + victime.getNom() + ", ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }

    public int getReputation() {
        return reputation;
    }

    public String getClan() {
        return clan;
    }
    
    public int perdre() {
    	int argentPerdu = getArgent();
    	perdreArgent(argentPerdu);
    	reputation -= 1;
    	parler("J'ai perdu mon duel et mes " + argentPerdu + " sous, snif. J'ai déshonoré le clan de " + clan + ".");
    	return argentPerdu;
    }

    public void gagner(int gain) {
    	gagnerArgent(gain);
    	reputation += 1;
    	parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
    }
}
