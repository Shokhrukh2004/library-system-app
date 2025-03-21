package org.github.librarysystem.models;

public abstract class User {
    private int userId;
    private String name;
    private String email;
    private static int id = 1;

    public User(String name, String email){
        this.name = name;
        this.email = email;
        this.userId = id;
        id++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public abstract void borrowBook(Book book);
    public abstract void returnBook(Book book);
}
