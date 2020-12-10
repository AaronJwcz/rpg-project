package sample;

public class Bouclier extends Arme
{
    protected int degatsReduits;

    public Bouclier()
    {
        super();
        this.degatsReduits = 5;
    }

    //getters
    public int getReduction()
    {
        return this.degatsReduits;
    }
}
