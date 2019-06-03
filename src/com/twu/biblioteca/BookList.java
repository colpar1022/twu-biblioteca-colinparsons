/**
 * Book List class extends ItemList
 */

package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.Scanner;

public class BookList implements ItemList {
    SecurityGuard blart = new SecurityGuard();  //This security guard is used to ensure proper input.
    private LinkedList<Book> BList = new LinkedList<Book>();
    private Book a = new Book();
    private Book b = new Book();
    private Book c = new Book();
    private Book d = new Book();
    private Book e = new Book();

    public BookList(){
        //Because there is no actual database, the example books are set here...
        a.setTitle("Metro 2033"); a.setAuthor("Dmitry Glukhovsky"); a.setPublishDate(2003);
        b.setTitle("The Graveyard Book"); b.setAuthor("Neil Gaiman"); b.setPublishDate(2008);
        c.setTitle("The Lorax"); c.setAuthor("Dr. Seuss"); c.setPublishDate(1971);
        d.setTitle("The Elementals"); d.setAuthor("C. Parsons"); d.setPublishDate(2018);
        e.setTitle("The BFG"); e.setAuthor("Roald Dahl"); e.setPublishDate(1982);
        //And added the list here here...
        BList.add(a);
        BList.add(b);
        BList.add(c);
        BList.add(d);
        BList.add(e);
    }

    /**
     * Displays the book list for viewing.
     * Provides the user with selection options by calling listOptions.
     * Books that available for checkout are set as true in the Availability column.
     * Books that are not available for checkout are set to false in the Availability column.
     */
    public void displayList() {
        System.out.println("+------+-------------------------------+-------------------------------+-----------+-----------+");
        System.out.printf("|%5s| %30s| %30s| %10s| %10s|", "OPTION", "TITLE", "AUTHOR", "PUBLISHED", "AVAILABLE");
        System.out.println("\n+------+-------------------------------+-------------------------------+-----------+-----------+");
        for(int i = 0; i < BList.size(); i++) {
            Book toShow = BList.get(i);
            System.out.format("|%6d| %30s| %30s| %10d| %10b|", i + 1, toShow.getTitle(), toShow.getAuthor(), toShow.getPublishDate(),
                    toShow.getIsCheckedOut());
            System.out.println();
            System.out.println("+------+-------------------------------+-------------------------------+-----------+-----------+");
        }
        listOptions();
    }

    /**
     * Acts as the main controller for the Book List.
     * If the user wants to leave at any point, they will type the number 0.
     * The nextInt that scoob takes in is decremented by one in order to prevent "off by 1" errors.
     * "selected" is a temporary Book object used to implement the functionality.
     */
    public void listOptions(){
        Boolean bail = false;   //Used for loop control when options are being selected.
        Scanner scoob = new Scanner(System.in); //Scanner scoob sniffs for the user's selection.

        System.out.println("Type in the option number to see more options...or type 0 to go back to exit the program: ");

        int bookSelection = blart.checkForInt(scoob);
        bookSelection = bookSelection - 1;
        if (bookSelection == -1) {  //Fires if the user requests to end the program.
            System.out.println("User has requested to end the program.");
            System.exit(0);     //Effectively ends the program at the user's request.
        } else if (bookSelection < -1 || bookSelection >= BList.size()) {   //Fires when the user enters an out of bounds integer
            System.out.println("Please select a valid option!");
            displayList();
        } else {    //Fires when the user enters a valid option.
            Book selected = BList.get(bookSelection);   //Temporary Book object used for functionality in house.

            System.out.println("Please enter the number of the action you would like to perform on " +
                    selected.getTitle() + ":");
            System.out.println("1. Checkout Book\n2. Return Book\n3. Return to Book List");

            while (!bail) {     //Will run as long as the user continues to enter invalid options.
                int userSelection = blart.checkForInt(scoob);
                switch (userSelection) {
                    case 1:     //Fires when user requests to checkout a book.
                        System.out.println("User requested to checkout a book.");
                        if(!selected.getIsCheckedOut()){
                            System.out.println("Sorry, that book is not available.");
                        }else {
                            selected.setIsCheckedOut(false);
                            System.out.println("Thank you! Enjoy the book.");
                        }
                        bail = true;
                        displayList();
                        break;
                    case 2:     //Fires when the user requests to return a book
                        System.out.println("User requested to return a book.");
                        if(selected.getIsCheckedOut()){
                            System.out.println("This is not a valid book to return. It may already be available.");
                        }else {
                            selected.setIsCheckedOut(true);
                            System.out.println("Thank you for returning the book.");
                        }
                        bail = true;
                        displayList();
                        break;
                    case 3:     //Fires when the user requests to return to the Book List.
                        System.out.println("User requested to return to Book List.");
                        bail = true;
                        displayList();
                        break;
                    default:
                        System.out.println("Please select a valid option!");
                }
            }
        }
        scoob.close();      //Lets scoob go to sleep.
    }
}
