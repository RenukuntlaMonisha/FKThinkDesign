
class Gear{

    double chain_ring,cog;

    public Gear(double chainring,double cog)
    {
        this.chain_ring = chain_ring;
        this.cog = cog;
    }

    public double Ratio()
    {
        return chain_ring/cog;

    }

}
