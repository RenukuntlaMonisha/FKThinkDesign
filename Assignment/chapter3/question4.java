import java.util.*;

class Gear{

    private double chainring,cog,rim,tyre;
    private Wheels wheel;
     Gear(double chainring, double cog, double rim, double tyre)
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


public class question4
{

     question4(HashMap<String,Double> args)
    {
        Gear obj = new Gear(args.get("chainring"),args.get("cog"),args.get("rim"),args.get("tyre"));
    }

}