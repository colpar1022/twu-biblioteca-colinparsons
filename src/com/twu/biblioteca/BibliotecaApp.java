/**
 * Author: Colin Parsons
 * Biblioteca Main
 * Version: 1.0.0
 * Copyright
 */
package com.twu.biblioteca;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Scanner userOption = new Scanner(System.in);
        boolean bail = false;
        ItemList BList = new BookList();

        System.out.println("\nWelcome to the Biblioteca. \nYour one-stop-shop for great book titles in Bangalore!\n");
        System.out.println("Main Menu:\n1. Book List\n2. Exit Program");

        while(!bail) {
            System.out.println("\nEnter the corresponding number for what you would like to do: ");
            int optionNum = userOption.nextInt();

            switch (optionNum) {
                case 1:
                    System.out.println("User requested Book List");
                    BList.displayList();
                    break;
                case 2:
                    System.out.println("User requested to end program");
                    bail = true;
                    break;
                default:
                    System.out.println("Please select a valid option!");
            }
        }
        userOption.close();
    }
}