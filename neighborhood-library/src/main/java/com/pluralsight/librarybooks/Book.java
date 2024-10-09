package com.pluralsight.librarybooks;

public class Book {
    private static String title;
    private String isbn;
    private int bookID;
    private String checkedOutTo;

    public Book(String title, String isbn) {
        this.title = title;
        this.isbn = isbn;
    }

    public static String getTitle(Book b){
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
        this.isbn = isbn;

    }
}
