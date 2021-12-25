package com.company;

import java.util.List;

public class BseOtdel {
    public BseOtdel(List<Book> books) {
    }

    public void addNewBook() {
    }

    public void showAllBooks() {
    }

    public void searchByAuthorBook(String juryi_pak) {
    }

    public void showAllInformation() {
    }

    public void showHowMuchBooksAtAll() {
    }

    public void addNewBook(long l, String antony_grimsby, String s, long l1) {
    }

    public abstract class BaseOtdel {
        private List<Book> books;

        @Override
        public String toString() {
            return "BaseOtdel{" +
                    "books=" + books +
                    '}';
        }

        public void addNewBook(Book book) {
            books.add(book);
        }

        public void showAllBooks() {
            System.out.println(books);
        }

        public void showAllInformation() {
            System.out.println(books);
        }

        public void searchByAuthorBook(String nameBook) {
             boolean check = false;
            for (Book book : books) {
                if (book.getAuthor().equals(nameBook)) {
                    System.out.println(book);
                    check = true;
                }
            }
            if (!check) {
                System.err.println("Нет книги с таким автором!");
            }
        }

        public BaseOtdel(List<Book> books) {
            this.books = books;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }
    }

}
