/**
 * Book List class extends ItemList
 */

package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.Scanner;

public class BookList implements ItemList {
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

    public void listOptions(){
        Boolean bail = false;
        Scanner scoob = new Scanner(System.in);
        System.out.println("Type in the option number to see more options...or type 0 to go back to exit the program: ");
        int bookSelection = (scoob.nextInt() - 1);

        if(bookSelection == -1){
            System.out.println("User has requested to end the program.");
            System.exit(0);
        }else if(bookSelection < -1 || bookSelection >= BList.size()){
            System.out.println("Please select a valid option!");
        }else{
            System.out.println("Please enter the number of the action you would like to perform:");
            System.out.println("1. Checkout Book\n2. Return Book\n3. Return to Book List");

            while(!bail) {
                int userSelection = scoob.nextInt();
                switch (userSelection) {
                    case 1:
                        System.out.println("User requested to checkout a book.");
                        bail = true;
                        displayList();
                        break;
                    case 2:
                        System.out.println("User requested to return a book.");
                        bail = true;
                        displayList();
                        break;
                    case 3:
                        System.out.println("User requested to return to Book List.");
                        bail = true;
                        displayList();
                        break;
                    default:
                        System.out.println("Please select a valid option!");
                }
            }
        }
        scoob.close();
    }
}
