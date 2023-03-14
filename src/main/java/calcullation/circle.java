package calcullation;

import declearinterface.calculates;

public class circle implements calculates {

    private double sideOne;
    private double area;
    private int perimeter;

    public void input(int side1) {
        sideOne = side1;
        area();
        perimeter();
    }

    public void area() {
        area = 3.14 * (sideOne * sideOne);
        System.out.printf("\n Area Of Circle  = " + area);
    }

    public void perimeter() {
        perimeter = (int) (2 * sideOne * 3.14);
        System.out.printf("\n Perimeter Of Circle = " + perimeter);
    }

}