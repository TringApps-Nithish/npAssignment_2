package settingvalues;

import calcullation.circle;
import calcullation.rectangle;
import calcullation.triangle;

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
        triangle obj = new triangle();
        obj.input(side1, side2, side3);
    }

    public setvalues(String name, int side1, int side2) {
        shapeName = name;
        sideOne = side1;
        sideTwo = side2;
        rectangle obj = new rectangle();
        obj.input(side1, side2);
    }

    public setvalues(String name, int side1) {
        shapeName = name;
        sideOne = side1;
        circle obj = new circle();
        obj.input(side1);
    }
}