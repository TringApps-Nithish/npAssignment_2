package calculation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Rectangle implements Calculates {
    private Logger l = Logger.getLogger("Switchch");

    private int sideOne;
    private int sideTwo;
    private int area;
    private int perimeter;
    private String shapeName;

    public Rectangle(String name, int side1, int side2) {
        sideOne = side1;
        sideTwo = side2;
        shapeName = name;
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