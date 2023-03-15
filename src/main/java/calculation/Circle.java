package calculation;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Circle implements Calculates {

    private Logger l = Logger.getLogger("Switchch");

    private double sideOne;
    private double area;
    private double perimeter;
    private String shapeName;

    public Circle(String name, int side1) {
        sideOne = side1;
        shapeName = name;
        area();
        perimeter();
    }

    public void area() {
        area = 3.14 * (sideOne * sideOne);
        l.log(Level.INFO, () -> ("\n Area Of Circle  = " + area));
    }

    public void perimeter() {
        perimeter = (2 * sideOne * 3.14);
        l.log(Level.INFO, () -> ("\n Perimeter Of Circle = " + perimeter));
    }

}