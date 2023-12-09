package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookShelfTest {
    private static Scanner scanner = new Scanner(System.in);
    private static BookShelf bookShelf = new BookShelf();

    private static final String BOOK_NOT_ADD = "Книга не добавлена";

    public static void main(String[] args) {
        String menuItem = "";
        do {
            printBookShelf();
            showMenu();
            menuItem = executeCommand();
        } while(!menuItem.equals("q"));
        scanner.close();
    }

    private static void printBookShelf() {
        if (bookShelf.getCountBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            int lengthShelf = bookShelf.getLengthShelves();
            System.out.print("Количество книг: " + bookShelf.getCountBooks() + " ");
            System.out.println("Количество свободных полок: " + bookShelf.getCountFreeShelves());
            System.out.println("-".repeat(lengthShelf + 4));
            Book[] books = bookShelf.getAllBooks();
            for (Book book : books) {
                System.out.println(String.format("| %-" + lengthShelf + "s |", book));
                System.out.println("-".repeat(lengthShelf + 4));
            }
        }
    }

    private static void showMenu() {
        System.out.print("""
                Выберите действие:
                1. Добавить книгу
                2. Удалить книгу
                3. Найти книгу
                4. Очистить шкаф
                q. Выход из программы
                Введите ваш ответ:\s""");
    }

    private static String executeCommand() {
        String menuItem = scanner.nextLine();
        switch (menuItem) {
            case "1" -> addBook();
            case "2" -> deleteBook();
            case "3" -> findBook();
            case "4" -> clearBookShelf();
            case "q" -> {return menuItem;}
            default -> System.out.println("Введена неверная команда");
        };
        System.out.println("Для продолжения нажмите Enter");
        scanner.nextLine();
        return menuItem;
    }

    private static void addBook() {
        System.out.println("Введите информацию о книге в формате: автор, название, год издания");
        String bookInfo = scanner.nextLine();
        try {
            Book book = new Book(bookInfo);
            if(bookShelf.addBook(book)) {
                System.out.println("Книга добавлена");
            } else {
                System.out.println("Шкаф заполнен. Для добавления сначала удалите какую нибудь книгу");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + "\n" + BOOK_NOT_ADD);
        }
    }

    private static void deleteBook() {
        System.out.print("Введите название книги для удаления: ");
        String title = scanner.nextLine();
        if(bookShelf.deleteBook(title)) {
            System.out.println("Книга удалена");
        } else {
            System.out.println("Книга не найдена");
        }
    }

    private static void findBook() {
        System.out.print("Введите название книги для поиска: ");
        String title = scanner.nextLine();
        Book book = bookShelf.findBook(title);
        if(book != null) {
            System.out.println("Книга найдена\n" + book);
        } else {
            System.out.println("Книга не найдена");
        }
    }

    private static void clearBookShelf() {
        bookShelf.clearBookShelf();
        System.out.println("Шкаф очищен");
    }
}
