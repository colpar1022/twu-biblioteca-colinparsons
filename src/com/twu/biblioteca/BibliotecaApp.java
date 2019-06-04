/**
 * Author: Colin Parsons
 * Biblioteca Main
 * Version: 1.5.0
 * Copyright
 */
package com.twu.biblioteca;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        SecurityGuard blart = new SecurityGuard();  //This security guard is used to ensure proper input from user.
        Scanner userOption = new Scanner(System.in);
        boolean bail = false;
        ItemList BList = new BookList();
        ItemList MList = new MovieList();
        UserList UList = new UserList();
        System.out.println("\nWelcome to the Biblioteca. \nYour one-stop-shop for great book and movie titles in Bangalore!\n");

        User loggedIn = UList.checkUser();

        System.out.println("Main Menu:\n1. Book List\n2. Movie List\n3. View Profile\n4. Exit Program");
        //Option selection controller
        while(!bail) {
            System.out.println("\nEnter the corresponding number for what you would like to do: ");
            int optionNum = blart.checkForInt(userOption);

            switch (optionNum) {
                case 1:
                    System.out.println("User requested Book List");
                    BList.displayList();
                    break;
                case 2:
                    System.out.println("User requested Movie List");
                    MList.displayList();
                    break;
                case 3:
                    System.out.println("User requested to view profile");
                    UList.displayList(loggedIn);
                    break;
                case 4:
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