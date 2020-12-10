package sample;

import java.util.ArrayList;

public class Chasseur extends Personnage
{
    public Chasseur()
    {
        super(90, 100, 1, new ArrayList<>());
        armes.add(new Arc());
    }

    public void attaqueBasique(Personnage cible)
    {
        int degatsInfliges = 0;
        for(Arme a : cible.armes)
        {
            if (a instanceof Bouclier)
            {
                degatsInfliges -= ((Bouclier) a).getReduction();
                break;
            }
        }
        for(Arme a : this.armes)
        {
            if (a instanceof Arc)
            {
                degatsInfliges += ((Arc) a).getDegats();
                ((Arc) a).nbFleches--;
                break;
            }
        }
        cible.pv -= degatsInfliges;
    }

    public void sortPuissant(Personnage cible)
    {
        int degatsInfliges = 30;
        for(Arme a : cible.armes)
        {
            if (a instanceof Bouclier)
            {
                degatsInfliges -= ((Bouclier) a).getReduction();
                break;
            }
        }
        cible.pv -= degatsInfliges;
        this.mana -= 60;
    }
}
