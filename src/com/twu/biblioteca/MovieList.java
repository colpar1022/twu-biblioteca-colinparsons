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
        System.out.println("+------+-------------------------------+-------------------------------+-----------+-----------+");
        System.out.printf("|%5s| %30s| %30s| %10s| %10s| %10s|", "OPTION", "TITLE", "DIRECTOR", "YEAR", "RATING", "AVAILABLE");
        System.out.println("\n+------+-------------------------------+-------------------------------+-----------+-----------+");
        for(int i = 0; i < MList.size(); i++) {
            Movie toShow = MList.get(i);
            System.out.format("|%6d| %30s| %30s| %10d| %10s| %10b|", i + 1, toShow.getTitle(), toShow.getDirector(), toShow.getYear(),
                    toShow.getRating(), toShow.getIsCheckedOut());
            System.out.println();
            System.out.println("+------+-------------------------------+-------------------------------+-----------+-----------+");
        }
        listOptions();
    }

    public void listOptions(){

    }
}
