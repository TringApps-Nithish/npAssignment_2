package calcullation;

import java.util.logging.Level;
import java.util.logging.Logger;

import declearinterface.calculates;

public class Rectangle implements calculates {
    private Logger l = Logger.getLogger("Switchch");

    private int sideOne;
    private int sideTwo;
    private int area;
    private int perimeter;

    public void input(int side1, int side2) {
        sideOne = side1;
        sideTwo = side2;
        area();
        perimeter();
    }

    public void area() {
        area = (sideOne * sideTwo);
        l.log(Level.INFO, () -> ("\n Area Of Rectangle  = " + area));
    }

    public void perimeter() {
        perimeter = (sideOne + sideTwo) * 2;
        l.log(Level.INFO, () -> ("\n Perimeter Of Rectangle = " + perimeter));
    }

}