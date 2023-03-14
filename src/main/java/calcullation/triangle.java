package calcullation;

import declearinterface.calculates;

public class triangle implements calculates {

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
        System.out.printf("\n Area Of Triangle  = " + area);
    }

    public void perimeter() {
        perimeter = sideOne + sideTwo + sideThree;
        System.out.printf("\n Perimeter Of Circle = " + perimeter);
    }

}