package com.company;

public class Art extends Library {
    private Books[] books;
    private int count = 0;

    public Art() {
    }

    public Art(String name,int size,Books[] books) {
        super(name);
//        book(size);
        int chek = 0;
        this.books = new Books[size];
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null){
                this.books[i] = books[i];
                chek++;
                count++;
                if (books.length == chek)break;

            }
        }
    }


    @Override
    public String toString() {
        return "Name. " + getName() +"\nCount of books. " + count;
    }

    public Books[] getBooks() {
        return books;
    }

    public void setBooks(Books[] books) {
        this.books = books;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public void setCount(int count) {
        this.count = count;
    }
}
