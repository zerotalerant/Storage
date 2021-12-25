package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Book> book = new ArrayList<>();

        book.add(new Book(1L, "Luka Besson", "Boston",1945L));
        book.add(new Book(2L, "Alexandr Pushkin", "3 meeters under the sea",1934L));
        book.add(new Book(3L, "Nevil Dolgopups", "I will destroy Pakistan and safe India",1465L));
        book.add(new Book(4L, "Kim Anton", "How to become korean",1845L));
        book.add(new Book(5L, "Juryi Pak", "2 month without food",1822L));

        BseOtdel bseOtdel = new ArtOtdel(book);

        bseOtdel.addNewBook(6L, "Antony Grimsby", "How to priruchit' pitona", 2021L);

        bseOtdel.showAllBooks();

        bseOtdel.searchByAuthorBook("Juryi Pak");

        bseOtdel.showAllInformation();

        bseOtdel.showHowMuchBooksAtAll();


    }

}
