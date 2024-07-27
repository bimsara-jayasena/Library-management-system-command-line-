package org.example;

public class Book {
    private String genre;
    private String name;

    private String author;
    private int price;
    public Book(String genre,String name,String author,int price){
        this.genre=genre;
        this.name=name;
        this.author=author;
        this.price=price;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBookDetails(){
        return "Genre: "+genre+"\n"+"Name: "+name+"\n"+"Author: "+author+"\n"+"Price: "+price;
    }
}
