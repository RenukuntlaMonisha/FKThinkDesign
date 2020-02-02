class Gear {


    private double chainring,cog;
    private Wheels wheel;

    public void setChainring(double chainring)
    {
        this.chainring = chainring;
    }

    public void setCog(double cog)
    {
        this.cog = cog;
    }

    public void setWheels(Wheels wheel)
    {
        this.wheel = wheel;
    }

    public double getChainring() { 
        return this.chainring; 
    }
    public double getCog() {
     return this.cog; 
    }
    public Wheels getWheels(){
     return this.wheel; 
   }


     Gear(double chainring,double cog,Wheels wheel)
    {
        setChainring(chainring);
        setCog(cog);
        setWheels(wheel);
    }

     double Ratio()
    {
        return chainring/cog;
    }

     double getGearInches()
    {
        return Ratio()*(wheel.Diameter());
    }

}

class Wheels{

    double tyre,rim;

     Wheels(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

     double Diameter()
    {
        return rim+tyre*2;
    }

     double Circumference()
    {
        return Diameter()* Math.PI;
    }

}