package personnages;

public class Humain {
	// Attributs privés
	private String nom;
	private String boissonFavorite;
	private int argent;

	// Constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	// Méthode qui permet à un humain de dire bonjour
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	// Méthode qui permet à un humain de boire
	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	// Méthode qui permet à un humain de s'acheter un bien
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
		}
	}

	// Méthode pour gagner de l'argent
	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	// Méthode pour perdre de l'argent
	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	// Méthode générique pour faire parler un humain
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	//Accesseur argent
	public int getArgent() {
		return argent;
	}

	public String getNom() {
		return nom;
	}
}