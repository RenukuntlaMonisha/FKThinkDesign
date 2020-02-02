public class Gear{

    private double chainring,cog;

    public void setChainring(double chainring)
    {
        this.chainring = chainring;
    }

    public void setCog(double cog)
    {
        this.cog = cog;
    }

    public double getChainring() {

     return this.chainring; 
    }

    public double getCog() {

        return this.cog; 
    }

    Gear(double chainring,double cog) {
        setChainring(chainring);
        setCog(cog);
    }

    double Ratio()
    {
        return chainring/cog;

    }

}