package org.github.librarysystem.models;

public class Book {

    private String title;
    private String author;
    private int bookId;
    private boolean isAvailable;
    static private int id = 1;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.bookId = id;
        this.isAvailable = true;
        id++;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void markAsBorrowed(){
        this.isAvailable = false;
    }

    public void markAsReturned(){
        this.isAvailable = true;
    }

}
