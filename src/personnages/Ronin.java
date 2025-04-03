package personnages;

// Classe Ronin qui h�rite de Humain
public class Ronin extends Humain {
    private int honneur;

    // Constructeur
    public Ronin(String nom, String boissonFavorite, int argent) {
        super(nom, boissonFavorite, argent);  // Appel au constructeur de la classe m�re Humain
        this.honneur = 1;  // Initialisation de l'honneur
    }

    // M�thode qui permet au Ronin de donner 10% de son argent � un commer�ant
    public void donner(Commercant beneficiaire) {
        int montantDonne = (int) (getArgent() * 0.10);  // 10% de l'argent du Ronin
        perdreArgent(montantDonne);  // Le Ronin perd cet argent
        beneficiaire.gagnerArgent(montantDonne);  // Le commer�ant gagne cet argent
        parler("Marco prend ces " + montantDonne + " sous.");
        beneficiaire.parler(montantDonne + " sous ! Je te remercie g�n�reux donateur!");
    }
}
