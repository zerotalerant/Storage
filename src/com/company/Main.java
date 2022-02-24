package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        Art art = new Art("Art",50,new Books[]{new Books(1,"Yuval Noah Harrari","12.01.12"),new Books(2,"LevTolstoy","1828"),new Books(3,"Alexandr pushcin","1799")});
        Legal legal = new Legal();
        Technical technical = new Technical();
        int point;
        System.out.println(art);
        do {
            System.out.println("1. Добавить в художественный отдел ");
            System.out.println("2. Добавить в технический отдел ");
            System.out.println("3. Добавить в юридический отдел ");
            System.out.println("4. Показать книги худ. отдела");
            System.out.println("5. Показать книги тех. отдела ");
            System.out.println("6. Показать книги юр.  отдела");
            System.out.println("7. Показать всю информацию худ. отдела ");
            System.out.println("8. Показать всю информацию тех. отдела ");
            System.out.println("9. Показать всю информацию юр. отдела ");
            System.out.println("10. Поиск в худ. отделе по имени");
            System.out.println("11. Поиск в тех. отделе по имени");
            System.out.println("12. Поиск в юр. отделе по имени");
            System.out.println("0. Finished");
            point = scanner.nextInt();
            switch (point){
                case 1 : art.addBook(art.getBooks());
                    break;
                case 4 : art.showAllBooks(art.getBooks());
                    break;
                case 7 : art.informationAboutOtdel(art.getBooks());
                    break;
                case 10 :
                    System.out.print("Input the name autor: ");
                    String nameThe = scanner.next();
                    art.foundBooks(art.getBooks(),nameThe);
                    break;
                case 11:
                    System.out.println(art.countOfBooks(art.getBooks()));
                    break;
            }
            System.out.println(art);

        }while (point != 0);





    }

    }
