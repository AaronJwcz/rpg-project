package sample;

import java.util.ArrayList;

public class Guerrier extends Personnage
{
    public Guerrier()
    {
        super(100, 80, 1, new ArrayList<>());
        armes.add(new Epee());
        armes.add(new Bouclier());
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
            if (a instanceof Epee)
            {
                degatsInfliges += ((Epee) a).getDegats();
                break;
            }
        }
        cible.pv -= degatsInfliges;
    }

    public void SortPuissant(Personnage cible)
    {
        int degatsInfliges = 25;
        for(Arme a : cible.armes)
        {
            if (a instanceof Bouclier)
            {
                degatsInfliges -= ((Bouclier) a).getReduction();
                break;
            }
        }
        cible.pv -= degatsInfliges;
        this.mana -= 50;
    }
}
