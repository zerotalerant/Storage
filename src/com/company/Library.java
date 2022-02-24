package com.company;

import java.util.Scanner;

public class Library {
    Scanner scanner = new Scanner(System.in);

    private String name;
    protected int count = 0;

    public Library() {
    }

    public Library(String name) {
        this.name = name;
    }


    public void addBook(Books[] books) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                System.out.print("Input id: ");
                int id = scanner.nextInt();

                System.out.print("Input name autor: ");
                String name = scanner.next();

                System.out.print("Input date: ");
                String date = scanner.next();

                books[i] = new Books(id, name, date);
                break;
            }
        }

    }

    public void showAllBooks(Books[] books) {

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
//            if (books[i].getId() == books[i+1].getId()) books[i+1].setId(books[i].getId() +1);

            }
        }
    }

    public void informationAboutOtdel(Books[] books) {

        System.out.println("Name: " + name + "\nBooks: ");
        for (Books book : books) {
            if (book != null) {
                System.out.println(book + ",\t");
            }
        }

    }

    public void foundBooks(Books[] books, String nameAutor) {

        for (Books book : books) {
            if (book != null) {
                if (book.getNameAutor().equals(nameAutor)) {
                    System.out.println(book);
                }
            }

        }

    }

    public int countOfBooks(Books[] books) {
        int counts = 0;
        for (Books book : books) {
            if (book != null) {
                counts++;
            }

        }
        return counts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
