package sample;

public class Partie {
    private Personnage heros, adversaire;
    public Partie(Personnage j1)
    {
        this.heros = j1;
        this.adversaire = new Chasseur();
    }
}
