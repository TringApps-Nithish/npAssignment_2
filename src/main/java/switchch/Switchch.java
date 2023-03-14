package switchch;

import java.util.logging.Logger;
import gettingvalues.Getvalues;

public class Switchch {
    private static Logger l = Logger.getLogger("Switchch");

    public Switchch(int choice) {
        Getvalues nextmove = new Getvalues();
        switch (choice) {

            case 1 -> nextmove.triangle();
            case 2 -> nextmove.rectangle();
            case 3 -> nextmove.circle();
            case 4 -> System.exit(0);
            default -> l.info("Invalid Choice ...");
        }
    }
}
