package ru.deathkiller2009.models;

public class Book {
    private int id;
    private String author;
    private String title;
    private String publisher;
    private String year;
    private String annotation;

    public Book(int id, String author, String title, String publisher, String year, String annotation) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.annotation = annotation;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }
}
