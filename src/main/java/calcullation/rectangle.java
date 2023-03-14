package calcullation;

import declearinterface.calculates;

public class rectangle implements calculates {

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
        System.out.printf("\n Area Of Rectangle  = " + area);
    }

    public void perimeter() {
        perimeter = (sideOne + sideTwo) * 2;
        System.out.printf("\n Perimeter Of Rectangle = " + perimeter);
    }

}