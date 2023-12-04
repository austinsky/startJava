package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private static final int CAPACITY = 10;
    private int countBooks;
    private Book[] books;

    private int lengthShelves;

    public BookShelf() {
        books = new Book[CAPACITY];
    }

    public int getMaxLengthLine() {
        return lengthShelves;
    }

    // получить количество книг в шкафу
    public int getCountBook() {
        return countBooks;
    }

    // добавить книгу
    public boolean addBook(Book book) {
        if (countBooks >= 0 && countBooks < CAPACITY) {
            books[countBooks++] = book;
            if (lengthShelves < book.getBookInfoLength()) {
                lengthShelves = book.getBookInfoLength();
            }
            return true;
        }
        System.out.println("Шкаф заполнен. Для добавления сначала удалите какую нибудь книгу");
        return false;
    }

    // найти книгу
    public Book findBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    // удалить книгу
    public boolean deleteBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                if (i < countBooks - 1) {
                    System.arraycopy(books, i + 1, books, i,countBooks - i - 1);
                }
                books[countBooks - 1] = null;
                countBooks--;

                updateLengthShelves();
                return true;
            }
        }

        return false;
    }

    private void updateLengthShelves() {
        lengthShelves = 0;
        for (int j = 0; j < countBooks; j++) {
            if (lengthShelves < books[j].getBookInfoLength()) {
                lengthShelves = books[j].getBookInfoLength();
            }
        }
    }

    // получить все книги (только для визуализации шкафа)
    public Book[] getAllBooks() {
        Book[] result = new Book[countBooks];
        System.arraycopy(books, 0, result, 0, countBooks);
        return result;
    }

    // получить количество свободных полок
    public int getCountFreeBookShelfs() {
        return CAPACITY - countBooks;
    }

    // очистить шкаф
    public void clearBookShelf() {
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        countBooks = 0;
    }
}