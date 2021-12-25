package com.company;

public class Book {
    private Long id;
    private String author;
    private String name;
    private Long yearOfEnd;


    public Book() {

    }

    public Book(Long id, String author, String name, Long yearOfEnd) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.yearOfEnd = yearOfEnd;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getYearOfEnd() {
        return yearOfEnd;
    }

    public void setYearOfEnd(long yearOfEnd) {
        this.yearOfEnd = yearOfEnd;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", yearOfEnd=" + yearOfEnd +
                '}';
    }
}

