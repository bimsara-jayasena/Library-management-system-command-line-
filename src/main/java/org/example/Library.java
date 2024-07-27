package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private ArrayList<Book> books;
    public Library(ArrayList<Book> bookList){
        this.books=bookList;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public ArrayList<Book> getBooks(int input){
        ArrayList<Book> book=null;
        Scanner scanner=new Scanner(System.in);

        switch (input){
            case 1->book=getAllBooks();
            case 2->{
                System.out.print("Enter book name:");
                book=getBookDetailsByName(scanner.nextLine());
            }
            case 3->{
                System.out.print("Enter genre:");
                book=getBookDetailsByGenre(scanner.nextLine());
            }
            case 4->{
                System.out.print("Enter Author name:");
                book=getBookDetailsByAuthor(scanner.nextLine());
            }
        }
        return book;
    }
    //get all books
    public ArrayList<Book> getAllBooks(){

      return books;
    }
    public ArrayList<Book> getBookDetailsByName(String name){
        ArrayList<Book> book=new ArrayList<>();
        for(Book b:books){
            if(b.getName().contains(name)){
               book.add(b);
            } else{
                book=null;
            }

        }
        return book;
    }

    //get book by genre
    public ArrayList<Book> getBookDetailsByGenre(String genre){
       ArrayList<Book> book=new ArrayList<>();
        for(Book b:books){
            if(genre.equals(b.getGenre())){
               book.add(b);
            } else{
                book=null;
            }
        }
        return book;
    }

    //get book by Author
    public ArrayList<Book> getBookDetailsByAuthor(String author){
        ArrayList<Book> book=new ArrayList<>();
        for(Book b:books){
            if(author.equals(b.getAuthor())){
                book.add(b);
            } else{
                book=null;
            }
        }
        return book;
    }

}
