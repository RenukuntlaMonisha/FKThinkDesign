import java.util.*;

class Bicycle{

    private double Size;

    public Bicycle(HashMap<String,Double> args)
    {
        Size = args.get("Size");
    }

}
//inheritance;;

class Mountainbike extends Bicycle{

    private double tapeColour;

    public Mountainbike(HashMap<String,Double> args)
    {
        super(args);
        tapeColour = args.get("tapeColour");
    }

}