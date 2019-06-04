/**
 * Movie object File.
 */
package com.twu.biblioteca;

public class Movie {
    private String title;
    private int year;
    private String director;
    private String rating;
    private Boolean isCheckedOut;

    public Movie(){
        isCheckedOut = true;
    }

    public String getTitle() {
        return title;
    }
    public int getYear(){
        return year;
    }
    public String getDirector(){
        return director;
    }
    public String getRating(){
        return rating;
    }

    public void setTitle(String newTitle){
        if(newTitle.length() < 1){
            System.out.println("Title has been left blank, please enter the title name.");
        }else{
            title = newTitle;
        }
    }
    public void setAuthor(String newDirector){
        if(newDirector.length() < 1){
            System.out.println("Director has been left blank, please enter the director's name.");
        }else{
            director = newDirector;
        }
    }
    public void setYear(int newYear){
        if(newYear < 0){
            System.out.println("Year cannot be negative, enter correct year.");
        }else{
            year = newYear;
        }
    }
    public void setRating(String newRating){
        if(newRating.length() < 1){
            System.out.println("Rating has been left blank, please enter the rating of the movie.");
        }else{
            rating = newRating;
        }
    }
    public void setIsCheckedOut(Boolean checkedOut){
        if(checkedOut == isCheckedOut){
            System.out.println("Status of availability has not changed.");
        }else{
            isCheckedOut = checkedOut;
        }
    }
}
