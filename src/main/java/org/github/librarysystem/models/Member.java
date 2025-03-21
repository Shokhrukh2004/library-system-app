package org.github.librarysystem.models;

import java.util.ArrayList;
import java.util.List;

public class Member extends User{

    private List<Book> borrowedBooks;
    public Member(String name, String email) {
        super(name, email);
        this.borrowedBooks = new ArrayList<>();
    }

    @Override
    public void borrowBook(Book book) {
        if(book.getIsAvailable()){
            this.borrowedBooks.add(book);
            book.markAsBorrowed();
        }
    }

    @Override
    public void returnBook(Book book) {
        for(int i = 0; i < this.borrowedBooks.size(); i++){
            if(this.borrowedBooks.get(i).getTitle().equals(book.getTitle())){
                this.borrowedBooks.remove(i);
                book.markAsReturned();
            }
        }
    }
}
