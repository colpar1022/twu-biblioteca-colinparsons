package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private int publishDate;
    private Boolean isCheckedOut;

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublishDate(){
        return publishDate;
    }
}
