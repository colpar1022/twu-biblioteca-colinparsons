package com.twu.biblioteca;

import java.util.LinkedList;
import java.util.Scanner;

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
        System.out.println("+------+-------------------------------+-------------------------------+-----------+-----------+-----------+");
        System.out.printf("|%5s| %30s| %30s| %10s| %10s| %10s|", "OPTION", "TITLE", "DIRECTOR", "YEAR", "RATING", "AVAILABLE");
        System.out.println("\n+------+-------------------------------+-------------------------------+-----------+-----------+-----------+");
        for(int i = 0; i < MList.size(); i++) {
            Movie toShow = MList.get(i);
            System.out.format("|%6d| %30s| %30s| %10d| %10s| %10b|", i + 1, toShow.getTitle(), toShow.getDirector(), toShow.getYear(),
                    toShow.getRating(), toShow.getIsCheckedOut());
            System.out.println();
            System.out.println("+------+-------------------------------+-------------------------------+-----------+-----------+-----------+");
        }
        listOptions();
    }

    public void listOptions(){
        Boolean bail = false;   //Used for loop control when options are being selected.
        Scanner scoob = new Scanner(System.in); //Scanner scoob sniffs for the user's selection.

        System.out.println("Type in the option number to see more options...or type 0 to go back to exit the program: ");

        int movieSelection = blart.checkForInt(scoob);
        movieSelection = movieSelection - 1;
        if (movieSelection == -1) {  //Fires if the user requests to end the program.
            System.out.println("User has requested to end the program.");
            System.exit(0);     //Effectively ends the program at the user's request.
        } else if (movieSelection < -1 || movieSelection >= MList.size()) {   //Fires when the user enters an out of bounds integer
            System.out.println("Please select a valid option!");
            displayList();
        } else {    //Fires when the user enters a valid option.
            Movie selected = MList.get(movieSelection);   //Temporary Movie object used for functionality in house.

            System.out.println("Please enter the number of the action you would like to perform on " +
                    selected.getTitle() + ":");
            System.out.println("1. Checkout Movie\n2. Return Movie\n3. Return to Book List");

            while (!bail) {     //Will run as long as the user continues to enter invalid options.
                int userSelection = blart.checkForInt(scoob);
                switch (userSelection) {
                    case 1:     //Fires when user requests to checkout a movie
                        System.out.println("User requested to checkout a movie.");
                        if(!selected.getIsCheckedOut()){
                            System.out.println("Sorry, that movie is not available.");
                        }else {
                            selected.setIsCheckedOut(false);
                            System.out.println("Thank you! Enjoy the book.");
                        }
                        bail = true;
                        displayList();
                        break;
                    case 2:     //Fires when the user requests to return a movie
                        System.out.println("User requested to return a movie.");
                        if(selected.getIsCheckedOut()){
                            System.out.println("This is not a valid movie to return. It may already be available.");
                        }else {
                            selected.setIsCheckedOut(true);
                            System.out.println("Thank you for returning the movie.");
                        }
                        bail = true;
                        displayList();
                        break;
                    case 3:     //Fires when the user requests to return to the Movie List.
                        System.out.println("User requested to return to Movie List.");
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
