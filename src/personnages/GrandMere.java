package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	private Random random = new Random();

	private enum TypeHumain {
		COMMERCANT, RONIN, SAMOURAI, TRAITRE, HABITANT
	}

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
		// mémoire limitée à 5 personnes
		this.memoire = new Humain[5];
	}

	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissances < memoire.length) {
			memoire[nbConnaissances] = humain;
			nbConnaissances++;
		} else {
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}

	private String humainHasard() {
		TypeHumain[] types = TypeHumain.values();
		int i = random.nextInt(types.length);
		TypeHumain type = types[i];

		switch (type) {
		case COMMERCANT:
			return "un commerçant";
		case RONIN:
			return "un ronin";
		case SAMOURAI:
			return "un samouraï";
		case TRAITRE:
			return "un traître";
		default:
			return "un habitant";
		}
	}
	
	public void ragoter() {
		for (int i = 0; i < nbConnaissances; i++) {
			Humain h = memoire[i];

			if (h instanceof Traitre) {
				parler("Je sais que " + h.getNom() + " est un traître. Petit chenapan !");
			} else {
				parler("Je crois que " + h.getNom() + " est " + humainHasard());
			}
		}
	}
}
