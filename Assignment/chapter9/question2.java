import java.util.*;
import java.io.*;


import static org.junit.Assert.*;


import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



import org.junit.Test;

class WheelTest{
    public void test(){
        Wheel2 wheel = new Wheel2(26, 2);
        assertEquals(30,wheel.diameter());

    }
}

class Wheel{

    double rim;
    double tyre;

    public Wheel(double rim,double tyre)
    {
        this.rim = rim;
        this.tyre = tyre;
    }

    double diameter()
    {
        return rim + (tyre*2);

    }


}