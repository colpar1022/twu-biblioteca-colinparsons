package com.twu.biblioteca;

import java.util.LinkedList;

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
        //And added here...
        BList.add(a);
        BList.add(b);
        BList.add(c);
        BList.add(d);
        BList.add(e);
    }

    public void displayList() {
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.printf("%5s %30s %30s %10s %5s", "OPTION", "TITLE", "AUTHOR", "PUBLISHED", "AVAILABLE");
        System.out.println("\n------------------------------------------------------------------------------------------");
        for(int i = 0; i < BList.size(); i++) {
            Book toShow = BList.get(i);
            System.out.format("%5d %30s %30s %10d %10b", i, toShow.getTitle(), toShow.getAuthor(), toShow.getPublishDate(),
                    toShow.getIsCheckedOut());
            System.out.println();
            //System.out.println("Title: " + toShow.getTitle());
            //System.out.println("Author: " + toShow.getAuthor());
            //System.out.println("Publish Date: " + toShow.getPublishDate());
            //System.out.println("Is checked out: " + toShow.getIsCheckedOut() + "\n");
        }
    }
}
