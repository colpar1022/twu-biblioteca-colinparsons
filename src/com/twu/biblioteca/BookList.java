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
        a.setTitle("Metro 2033"); a.setAuthor("Dmitry Glukhovsky"); a.setPublishDate(2003);
        b.setTitle("The Graveyard Book"); b.setAuthor("Neil Gaiman"); b.setPublishDate(2008);
        c.setTitle("The Lorax"); c.setAuthor("Dr. Seuss"); c.setPublishDate(1971);
        d.setTitle("The Elementals"); d.setAuthor("C. Parsons"); d.setPublishDate(2018);
        e.setTitle("The BFG"); e.setAuthor("Roald Dahl"); e.setPublishDate(1982);


        BList.add(a);
        BList.add(b);
        BList.add(c);
        BList.add(d);
        BList.add(e);

        System.out.println("Book list was instantiated.");
    }

    public void displayList() {
        for(int i = 0; i < BList.size(); i++) {
            Book toShow = BList.get(i);
            System.out.println(toShow.getTitle());
            System.out.println(toShow.getAuthor());
            System.out.println(toShow.getPublishDate());
            System.out.println(toShow.getIsCheckedOut());
        }
    }
}
