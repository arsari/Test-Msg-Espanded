/**
 * @topic Module Three: 3-1 zyBooks Activity: Conditionals Program (Labs 3.15.1)
 * @author Arturo Santiago-Rivera
 * @professor John Walton
 * @course IT-145-X5942 Found in App Development 18EW5
 * @university Southern New Hampshire University
 * @version 0.1.180519 19 May 2018
 */

// class import
import java.util.Scanner;

public class TextMsgExpander {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner for input
        Scanner scnr = new Scanner(System.in);
        
        // variables declaration
        String userMsg;
        String expAbbreviation;
        String expMsg;

        // prompt and confirm user input
        System.out.println("Enter text: ");
        userMsg = scnr.nextLine();

        System.out.println("You entered: " + userMsg);
        System.out.println();

        // evaluted user input
        expMsg = userMsg;
        
        if (expMsg.contains("LOL")) {
            expAbbreviation = "laughing out loud";
            expMsg = expMsg.replace("LOL", expAbbreviation);
            System.out.println("Replaced \"LOL\" with \"" + expAbbreviation + "\".");
        }
        
        if (expMsg.contains("BFF")) {
            expAbbreviation = "best friend forever";
            expMsg = expMsg.replace("BFF", expAbbreviation);
            System.out.println("Replaced \"BFF\" with \"" + expAbbreviation + "\".");

        }
        
        if (expMsg.contains("IDK")) {
            expAbbreviation = "I don't know";
            expMsg = expMsg.replace("IDK", expAbbreviation);
            System.out.println("Replaced \"IDK\" with \"" + expAbbreviation + "\".");

        }
        
        if (expMsg.contains("JK")) {
            expAbbreviation = "just kidding";
            expMsg = expMsg.replace("JK", expAbbreviation);
            System.out.println("Replaced \"JK\" with \"" + expAbbreviation + "\".");

        }
        
        if (expMsg.contains("TMI")) {
            expAbbreviation = "too much information";
            expMsg = expMsg.replace("TMI", expAbbreviation);
            System.out.println("Replaced \"TMI\" with \"" + expAbbreviation + "\".");

        }
        
        if (expMsg.contains("TTYL")) {
            expAbbreviation = "talk to you later";
            expMsg = expMsg.replace("TTYL", expAbbreviation);
            System.out.println("Replaced \"TTYL\" with \"" + expAbbreviation + "\".");
        }
        
        // output expanded message (expMsg)
        System.out.println();
        System.out.println("Original: " + userMsg);
        System.out.println();
        System.out.println("Expanded: " + expMsg);
        
        // close scanner
        scnr.close();
        
        return;
    }
}
