package switchch;

import java.util.logging.Logger;
import java.util.Scanner;

import settingvalues.setvalues;

public class Switchch {
    private Scanner sc = new Scanner(System.in);
    private Logger l = Logger.getLogger("Switchch");
    private int side_1;
    private int side_2;
    private int side_3;

    public Switchch(int choice) {
        switch (choice) {
            case 1 -> {
                l.info("\n Enter the Base Value : ");
                side_1 = sc.nextInt();
                l.info(" Enter the Lenth value : ");
                side_2 = sc.nextInt();
                l.info(" Enter the Hypoteneous of Triangle : ");
                side_3 = sc.nextInt();
                new setvalues("Triangle", side_1, side_2, side_3);
            }
            case 2 -> {
                l.info("\n Enter the Length Value : ");
                side_1 = sc.nextInt();
                l.info(" Enter the Width Value : ");
                side_2 = sc.nextInt();
                new setvalues("Rectangle", side_1, side_2);
            }
            case 3 -> {
                l.info("\n Enter the Radius Value : ");
                side_1 = sc.nextInt();
                new setvalues("Circle", side_1);
            }
            case 4 -> System.exit(0);
            default -> l.info("Invalid Choice ...");
        }
    }
}
