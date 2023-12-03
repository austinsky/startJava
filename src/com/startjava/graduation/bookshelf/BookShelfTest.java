package com.startjava.graduation.bookshelf;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BookShelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static BookShelf bookShelf = new BookShelf();

    public static void main(String[] args) {
        String answer = "";
        do {
            answer = showMenu();
            executeCommand(answer);
        } while(!answer.equals("q"));
        scanner.close();
    }

    private static String showMenu() {
        printBookShelf();
        System.out.print("""
                Выберите действие:
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу
                4. очистить шкаф
                q. Выход из программы
                Введите ваш ответ:""" + " ");
        return scanner.nextLine();
    }

    private static void executeCommand(String answer) {
        switch (answer) {
            case "1" -> {
                System.out.println("Введите информацию о книге в формате: автор, название, год издания");
                String bookInfo = scanner.nextLine();
                Book book = Book.createBook(bookInfo);
                if(book != null && bookShelf.addBook(book)) {
                    System.out.println("книга добавлена");
                } else {
                    System.out.println("при добавлении книги возникла ошибка. Книга не добавлена");
                }
            }
            case "2" -> {
                System.out.print("Введите название книги для удаления: ");
                String title = scanner.nextLine();
                if(bookShelf.deleteBook(title)) {
                    System.out.println("книга удалена");
                } else {
                    System.out.println("при удалении книги возникла ошибка. Книга не удалена");
                }
            }
            case "3" -> {
                System.out.print("Введите название книги для поиска: ");
                String title = scanner.nextLine();
                Book book = bookShelf.findBook(title);
                if(book != null) {
                    System.out.println("книга найдена");
                    System.out.println(book);
                } else {
                    System.out.println("Книга не найдена");
                }
            }
            case "4" -> {
                bookShelf.clearBookShelf();
                System.out.println("Шкаф очищен");
            }
            case "q" -> { return; }
            default -> {
                System.out.println("Введена неверная команда");
                return;
            }
        };
        System.out.println("Для продолжения нажмите Enter");
        scanner.nextLine();
    }

    private static void printBookShelf() {
        if (bookShelf.getCountBook() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.print("Количество книг: " + bookShelf.getCountBook() + " ");
            System.out.println("количество свободных полок: " + bookShelf.getCountFreeBookShelfs());
            System.out.println("-".repeat(bookShelf.getMaxLengthLine() + 4));
            Book[] books = bookShelf.getAllBooks();
            for (int i = 0; i < bookShelf.getCountBook(); i++) {
                System.out.println(String.format("| %-" + bookShelf.getMaxLengthLine() + "s |", books[i]));
                System.out.println("-".repeat(bookShelf.getMaxLengthLine() + 4));
            }
        }
    }

    private static void printBook(Book book) {
        System.out.println(book);
    }
}
