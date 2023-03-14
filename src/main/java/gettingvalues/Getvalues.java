package gettingvalues;

import java.util.logging.Logger;
import java.util.Scanner;

import calcullation.Circle;
import calcullation.Rectangle;
import calcullation.Triangle;

public class Getvalues {
    private Scanner sc = new Scanner(System.in);
    private Logger l = Logger.getLogger("Getvalues");
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public void triangle() {
        l.info("\n Enter the Base Value : ");
        sideOne = sc.nextInt();
        l.info(" Enter the Lenth value : ");
        sideTwo = sc.nextInt();
        l.info(" Enter the Hypoteneous of Triangle : ");
        sideThree = sc.nextInt();
        new Triangle("Triangle", sideOne, sideTwo, sideThree);
    }

    public void rectangle() {
        l.info("\n Enter the Length Value : ");
        sideOne = sc.nextInt();
        l.info(" Enter the Width Value : ");
        sideTwo = sc.nextInt();
        new Rectangle("Rectangle", sideOne, sideTwo);
    }

    public void circle() {
        l.info("\n Enter the Radius Value : ");
        sideOne = sc.nextInt();
        new Circle("Circle", sideOne);
    }
}