class Gear{


    private double chain_ring,cog,rim,tyre;

    private Wheels wheel1;

    public Gear(double chain_ring, double cog, double rim, double tyre)
    {
        this.chain_ring = chain_ring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
        wheel1 = new Wheels(rim,tyre);
    }

    public double Ratio()
    {
        return chain_ring/cog;
    }

    public double getGearInches()
    {
        return Ratio()*(wheel1.getDiameter());
    }

}