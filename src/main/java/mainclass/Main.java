package mainclass;

import java.util.Scanner;
import java.util.logging.Logger;

import switchch.Switching;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Logger l = Logger.getLogger("Switchch");

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 4) {
            l.info("t...... Shapes Availabel ......\n 1.Triangle \n 2.Rectangle \n 3.Circle \n 4.Exit ");
            l.info("\n\n Enter Your Choice : ");
            choice = sc.nextInt();
            new Switching(choice);
        }
    }
}
