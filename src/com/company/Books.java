package com.company;

public class Books{
    private int id;
    private String nameAutor;
    private String date;

    public Books(int id, String nameAutor, String date) {
        this.id = id;
        this.nameAutor = nameAutor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", nameAutor='" + nameAutor + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

