public class Gear{
    private double chainring,cog,rim,tyre;
    private Wheels wheel;

     Gear3(double chainring, double cog, double rim, double tyre)
    {
        this.chainring = chainring;
        this.cog = cog;
        this.rim = rim;
        this.tyre = tyre;
        wheel = new Wheels(rim,tyre);
    }

     double Ratio()
    {
        return chainring/cog;
    }

     double getGearInches()
    {
        return Ratio()*diameter();
    }

     double diameter()
    {
        return wheel.getDiameter();
    }

}