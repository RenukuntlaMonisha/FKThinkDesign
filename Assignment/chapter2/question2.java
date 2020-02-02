public class Gear{
    double chain_ring,cog,rim,tyre;
    //
    Gear(double chain_ring,double cog,double rim,double tyre)
    {
        this.chain_ring = chain_ring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
    }
    //
    //
    //


    public double Ratio()
    {
        return chain_ring/cog;
    }

    public double getGearInches()
    {
        return Ratio()*(rim+tyre*2);
    }

}