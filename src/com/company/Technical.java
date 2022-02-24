package com.company;

    public class Technical extends Library {
        private Books[] books;
        private boolean isHaveComputer;
        private int count =0;

        public Technical() {
        }

        public Technical(String name, int size, boolean isHaveComputer,Books[] books) {
            super(name);
            this.isHaveComputer = isHaveComputer;
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
            return "Name. " + getName() +"\nCount of books. " + count + "\nIs have computer. " + isHaveComputer;
        }

        public boolean isHaveComputer() {
            return isHaveComputer;
        }

        public void setHaveComputer(boolean haveComputer) {
            isHaveComputer = haveComputer;
        }

        @Override
        public int getCount() {
            return count;
        }

        @Override
        public void setCount(int count) {
            this.count = count;
        }

        public Books[] getBooks() {
            return books;
        }

        public void setBooks(Books[] books) {
            this.books = books;
        }
    }

