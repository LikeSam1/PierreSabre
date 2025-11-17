package personnages;

// Classe Ronin qui hérite de Humain
public class Ronin extends Humain {
    private int honneur;

    // Constructeur
    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);
        this.honneur = 1;
    }

    public void donner(Commercant beneficiaire) {
        int montantDonne = (int) (getArgent() * 0.10);
        perdreArgent(montantDonne);
        beneficiaire.gagnerArgent(montantDonne);
        parler("Marco prend ces " + montantDonne + " sous.");
        beneficiaire.parler(montantDonne + " sous ! Je te remercie généreux donateur!");
    }
    
    public void provoquer(Yakuza adversaire) {
    	parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
    	int force = honneur * 2;

    	if (force >= adversaire.getReputation()) {
    		parler("Je t'ai eu petit yakuza!");
    		int gain = adversaire.perdre();
    		gagnerArgent(gain);
    		honneur += 1;
    	} else {
    		int perte = getArgent();
    		perdreArgent(perte);
    		honneur -= 1;
    		parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
    		adversaire.gagner(perte);
    	}
    }

	public int getHonneur() {
		return honneur;
	}
}
