package settingvalues;

import calcullation.Circle;
import calcullation.Rectangle;
import calcullation.Triangle;

public class setvalues {
    private int sideOne;
    private int sideTwo;
    private int sideThree;
    private String shapeName;

    public setvalues(String name, int side1, int side2, int side3) {
        shapeName = name;
        sideOne = side1;
        sideTwo = side2;
        sideThree = side3;
        Triangle obj = new Triangle();
        obj.input(side1, side2, side3);
    }

    public setvalues(String name, int side1, int side2) {
        shapeName = name;
        sideOne = side1;
        sideTwo = side2;
        Rectangle obj = new Rectangle();
        obj.input(side1, side2);
    }

    public setvalues(String name, int side1) {
        shapeName = name;
        sideOne = side1;
        Circle obj = new Circle();
        obj.input(side1);
    }
}