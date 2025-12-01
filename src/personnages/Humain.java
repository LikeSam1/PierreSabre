package personnages;

public class Humain {
	// Attributs privés
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	protected Humain[] memoire = new Humain[30];
	protected int nbConnaissances = 0;

	// Constructeur
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " à " + prix + " sous.");
			perdreArgent(prix);
		} else {
			parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux même pas m'offrir un " + bien + " à " + prix + " sous.");
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

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
	
	public void faireConnaissanceAvec(Humain autre) {
		this.direBonjour();
		autre.repondre(this);
		this.memoriser(autre);
		autre.memoriser(this);
	}

	public void repondre(Humain humain) {
		this.direBonjour();
	}

	protected void memoriser(Humain humain) {
		if (nbConnaissances < memoire.length) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		} else {
			for (int i = 1; i < memoire.length; i++)
				memoire[i - 1] = memoire[i];
			memoire[memoire.length - 1] = humain;
		}
	}

	public void listerConnaissances() {
		if(nbConnaissances > 0) {
			parler("Je connais beaucoup de monde dont : ");
			for (int i = 0; i < nbConnaissances; i++) {
				System.out.print(memoire[i].getNom());
				if (i < nbConnaissances - 1) System.out.print(", ");
			}
			System.out.println();
		} else {
			parler("Je ne connais personnes");	
		}
	}
}