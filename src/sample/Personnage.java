package sample;

import java.util.ArrayList;

public class Personnage
{
    protected int pv;
    protected int mana;
    protected int niveau;
    protected ArrayList<Arme> armes;

    public Personnage(int pv, int mana, int niveau, ArrayList<Arme> armes)
    {
        this.pv = pv;
        this.mana = mana;
        this.niveau = niveau;
        this.armes = armes;
    }

    //getters
    public int getPV()
    {
        return this.pv;
    }
    public int getMana()
    {
        return this.mana;
    }
    public int getNiveau()
    {
        return this.niveau;
    }
    public ArrayList<Arme> getArmes()
    {
        return this.armes;
    }

    public void attaqueBasique(Personnage cible) {}
    public void sortPuissant(Personnage cible) {}
}
