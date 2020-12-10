package sample;

import java.util.ArrayList;

public class Mage extends Personnage
{
    public Mage()
    {
        super(70, 120, 1, new ArrayList<>());
    }

    public void attaqueBasique(Personnage cible)
    {
        int degatsInfliges = 20;
        cible.pv -= degatsInfliges;
        this.mana -= 10;
    }

    public void sortPuissant(Personnage cible)
    {
        int degatsInfliges = 50;
        cible.pv -= degatsInfliges;
        this.pv += 10;
        this.mana -= 50;
    }
}
