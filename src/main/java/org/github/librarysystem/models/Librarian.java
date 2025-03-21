package org.github.librarysystem.models;

public class Librarian extends User{

    private int employeeId;
    private int id = 1;

    public Librarian(String name, String email) {
        super(name, email);
        this.employeeId = id;
        id++;
    }

    @Override
    public void borrowBook(Book book) {

    }

    @Override
    public void returnBook(Book book) {

    }

    public void addBook(Book book){

    }

    public void removeBook(Book book){

    }

    public void addMember(Member member){

    }

    public void removeMember(Member member){

    }
}
