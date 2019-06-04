package com.twu.biblioteca;

import java.util.LinkedList;

public class MovieList implements ItemList {
    SecurityGuard blart = new SecurityGuard();  //This security guard is used to ensure proper input.
    private LinkedList<Movie> MList = new LinkedList<>();
    private Movie a = new Movie();
    private Movie b = new Movie();
    private Movie c = new Movie();
    private Movie d = new Movie();
    private Movie e = new Movie();

    public MovieList(){
        a.setTitle("Bee Movie"); a.setDirector("Simon J. Smith"); a.setRating("7"); a.setYear(2007);
        b.setTitle("History of the World: Part 1"); b.setDirector("Mel Brooks"); b.setRating("10"); b.setYear(1981);
        c.setTitle("Insidious"); c.setDirector("James Wan"); c.setRating("5"); c.setYear(2011);
        d.setTitle("Batman Begins"); d.setDirector("Christoper Nolan"); d.setRating("8"); d.setYear(2005);
        e.setTitle("Silver Knives"); e.setDirector("C. Parsons"); e.setRating("Unrated"); e.setYear(2030);

        MList.add(a);
        MList.add(b);
        MList.add(c);
        MList.add(d);
        MList.add(e);
    }

    public void displayList(){

    }

    public void listOptions(){

    }
}
