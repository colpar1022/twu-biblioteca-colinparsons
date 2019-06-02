package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int publishDate;
    private Boolean isCheckedOut;

    public Book(){
        isCheckedOut = false;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublishDate(){
        return publishDate;
    }

    public void setTitle(String newTitle){
        if(newTitle.length() < 1){
            System.out.println("Title has been left blank, please enter the title name.");
        }else{
            title = newTitle;
        }
    }
    public void setAuthor(String newAuthor){
        if(newAuthor.length() < 1){
            System.out.println("Author has been left blank, please enter the author's name.");
        }else{
            author = newAuthor;
        }
    }
    public void setPublishDate(int newPublishDate){
        if(newPublishDate < 0){
            System.out.println("Publish date cannot be negative, enter correct publish date.");
        }else{
            publishDate = newPublishDate;
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
