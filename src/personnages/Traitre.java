package personnages;

import java.util.Random;

public class Traitre extends Samourai {

	private int niveauTraitrise = 0;
	private Random random = new Random();

	public Traitre(String seigneur, String nom, String boissonFavorite, int argent) {
		super(seigneur, nom, boissonFavorite, argent);
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}

	public void ranconner(Commercant commercant) {
		if (niveauTraitrise >= 3) {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
			return;
		}
		parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer !");
		int argentAEnlever = commercant.getArgent() / 5;
		if (argentAEnlever == 0) {
			argentAEnlever = 1;
		} // pour éviter 0

		parler("Donne-moi " + argentAEnlever + " sous ou gare à toi !");

		commercant.perdreArgent(argentAEnlever);
		this.gagnerArgent(argentAEnlever);

		parler("Tout de suite grand " + getNom() + ".");

		niveauTraitrise++;
	}

	public void faireLeGentil() {
		if (getNbConnaissances() == 0) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
			return;
		}

		// Sélection aléatoire d’une personne dans la mémoire
		int index = random.nextInt(getNbConnaissances());
		Humain humainChoisi = getConnaissance(index);

		// On donne 1/20 de son argent
		int don = getArgent() / 20;
		if (don == 0)
			don = 1;

		parler("Il faut absolument remonter ma cote de confiance. " + "Je vais faire ami ami avec "
				+ humainChoisi.getNom() + ".");

		parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");

		this.perdreArgent(don);
		humainChoisi.gagnerArgent(don);

		parler("Merci " + getNom() + ". Vous êtes quelqu'un de bien.");

		niveauTraitrise--;
		if (niveauTraitrise < 0)
			niveauTraitrise = 0;
	}

	private int getNbConnaissances() {
		return super.nbConnaissances;
	}

	private Humain getConnaissance(int i) {
		return super.memoire[i];
	}

}
