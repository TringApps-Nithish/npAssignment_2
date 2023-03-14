package calcullation;

import declearinterface.calculates;

import java.util.logging.Level;
import java.util.logging.Logger;

public class triangle implements calculates {

    private Logger l = Logger.getLogger("Switchch");

    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private int area;
    private int perimeter;

    public void input(int side1, int side2, int side3) {
        sideOne = side1;
        sideTwo = side2;
        sideThree = side3;
        area();
        perimeter();
    }

    public void area() {
        area = (sideOne * sideTwo) / 2;
        l.log(Level.INFO, () -> ("\n Area Of Triangle  = " + area));
    }

    public void perimeter() {
        perimeter = sideOne + sideTwo + sideThree;
        l.log(Level.INFO, () -> ("\n Perimeter Of Circle = " + perimeter));
    }

}