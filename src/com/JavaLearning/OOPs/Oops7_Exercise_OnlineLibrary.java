package com.JavaLearning.OOPs;

/*
PROBLEM STATEMENT :
=>You have to implement a Library using java Library
    Methods : addBook,showAvailableBooks,issueBook,showIssuedBooks,returnBook
    Properties : # Array to store the available books
                 # Array to Store issued books

*/

import java.util.ArrayList;

class Library{
    public Library() {} //Default Constructor

    ArrayList<String>availableBookList=new ArrayList<String>(); //Array to store list of available books
    ArrayList<String>issuedBookList=new ArrayList<>();  //Array to store list of issued books

    public ArrayList<String> getAvailableBookList() {   //Getting Available BookList
        return availableBookList;
    }
    public void addBook(String str) {   //Add Book to Library
        this.availableBookList.add(str);
    }
    public ArrayList<String> getIssuedBookList() {  //Getting Issued BookList
        return issuedBookList;
    }

    public void issueBook(String book) { //Issue a book
        this.issuedBookList.add(book);
    }

    public void returnBook(String book){  //return issued book
        this.issuedBookList.remove(book);
    }

}

public class Oops7_Exercise_OnlineLibrary {
    public static void main(String[] args) {
        Library myLib=new Library();

        System.out.println("\nAvailable Books in Library : "+myLib.getAvailableBookList());
        myLib.addBook("ZeroToOne");
        myLib.addBook("Atomic Habits");
        myLib.addBook("Rich Dad Poor Dad");
        myLib.addBook("Psychology Of Money");
        myLib.addBook("IKIGAI");
        System.out.println("Available Books in Library : "+myLib.getAvailableBookList());

        System.out.println("\nIssued Book List : "+myLib.getIssuedBookList());
        myLib.issueBook("ZeroToOne");
        myLib.issueBook("Rich Dad Poor Dad");
        myLib.issueBook("IKIGAI");
        System.out.println("Issued Book List : "+myLib.getIssuedBookList());

        System.out.println("\nIssued Book List : "+myLib.getIssuedBookList());
        myLib.returnBook("IKIGAI");
        System.out.println("Issued Book List after returning an issued book: "+myLib.getIssuedBookList());
    }
}
