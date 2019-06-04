package com.twu.biblioteca;

import java.util.LinkedList;

public class MovieList implements ItemList {
    SecurityGuard blart = new SecurityGuard();  //This security guard is used to ensure proper input.
    private LinkedList<Movie> MList = new LinkedList<>();
    private Movie a = new Movie();
    private Book b = new Book();
    private Book c = new Book();
    private Book d = new Book();
    private Book e = new Book();

    public void displayList(){

    }

    public void listOptions(){

    }
}
