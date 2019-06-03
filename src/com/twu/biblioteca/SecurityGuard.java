/**
 * This is the security guard.
 * The point of the security guard is to ensure proper input from the user.
 */

package com.twu.biblioteca;

import java.util.Scanner;

public class SecurityGuard {

    /**
     * Checks to ensure that the input in an integer.
     * @param toCheck
     * @return
     */
    public int checkForInt(Scanner toCheck){
        Boolean bail = false;
        int correct = 0;

        while(!bail) {
            if (toCheck.hasNextInt()) {
                correct = toCheck.nextInt();
                bail = true;
            }else{
                System.out.println("Please select a valid option!");
                toCheck.nextLine();
            }
        }
        return correct;
    }
}
