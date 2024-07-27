package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Add Books
        ArrayList<Book> books=new ArrayList<>();

        Book b=new Book("Detective","The Adventures of Sherlock Holmes","Sir Arthur Conan Doyle",20);
        Book b2=new Book("Adventure","Five on a Treasure Island","Enid Blyton",20);
        Book b3=new Book("Detective","Sherlock Holmes:A Study in Scarlet","Sir Arthur Conan Doyle",20);
        Book b4=new Book("Adventure","Five Run Away Together","Enid Blyton",20);

        books.add(b);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        Library library=new Library(books);

        //Get books informations
        ArrayList<Book> res;

        String[] options={"1.get all book details",
                        "2.Search by book name",
                "3.Search by book genre",
                "4.Search by book author"
        };
        for(String i:options){
            System.out.println(i);
        }
        System.out.print("Enter Option:");
        Scanner scanner=new Scanner(System.in);
        int option=scanner.nextInt();
        res=library.getBooks(option);
        if(res!=null) {
            for (Book r : res) {
                System.out.println(r.getBookDetails());
            }
        }else{
            System.out.println("this book is not available ");
        }



    }
}