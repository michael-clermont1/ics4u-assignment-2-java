/*
 *
 * The program finds the maximum run of a string
 *
 * @author:  Michael Clermontl
 * @version: 1.0
 * @since:   2022-10-11
*/

import java.util.Scanner;

/**
* This is the starting of main program.
*/
public final class Index {
    /**
    * The utility class lint exception rule.
    *
    */
    private Index() {
        // nothing called
    }

    /**
    * The main calculation function.
    *
    * @param userWord - width number
    * @return maxRun - int
    */

    static int maxRunCalculator(final String userWord) {
        int count = 0;
        int maxRun = 0;
        char blankChar = ' ';
        for (char tempValue : userWord.toCharArray()) {
            if (tempValue == blankChar) {
                count++;
            } else {
                count = 1;
                blankChar = tempValue;
            }
            if (count > maxRun) {
                maxRun = count;
            }
        }
        return maxRun;
    }
    /**
    * The starting main() function.
    *
    * @param args No args will be used.
    */

    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        final String userString = sc.nextLine();
        System.out.printf("\nThe max amount of values in a row is %d",
                        maxRunCalculator(userString));
        System.out.println("\nDone.");
    }
}
