package personnages;

public class Humain {
    // Attributs priv�s
    private String nom;
    private String boissonFavorite;
    private int argent;

    // Constructeur
    public Humain(String nom, String boissonFavorite, int argent) {
        this.nom = nom;
        this.boissonFavorite = boissonFavorite;
        this.argent = argent;
    }

    // Accesseurs
    public String getNom() {
        return nom;
    }

    public int getArgent() {
        return argent;
    }

    // M�thode qui permet � un humain de dire bonjour
    public void direBonjour() {
        parler("Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFavorite + ".");
    }

    // M�thode qui permet � un humain de boire
    public void boire() {
        parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS !");
    }

    // M�thode qui permet � un humain de s'acheter un bien
    public void acheter(String bien, int prix) {
        if (argent >= prix) {
            perdreArgent(prix);
            parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir un " + bien + " � " + prix + " sous.");
        } else {
            parler("Je n'ai plus que " + argent + " sous en poche. Je ne peux m�me pas m'offrir un " + bien + " � " + prix + " sous.");
        }
    }

    // M�thode pour gagner de l'argent
    protected void gagnerArgent(int gain) {
        argent += gain;
    }

    // M�thode pour perdre de l'argent
    protected void perdreArgent(int perte) {
        argent -= perte;
    }

    // M�thode g�n�rique pour faire parler un humain
    protected void parler(String texte) {
        System.out.println("(" + nom + ") - " + texte);
    }
}
