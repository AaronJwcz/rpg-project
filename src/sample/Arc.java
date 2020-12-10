package sample;

public class Arc extends Arme
{
    protected int nbFleches;
    protected int degats;

    public Arc()
    {
        super();
        this.nbFleches = 20;
        this.degats = 10;
    }

    //getters
    public int getDegats()
    {
        return this.degats;
    }
}
