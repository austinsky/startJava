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

    public int getLengthShelves() {
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
        for (int i = 0; i < countBooks; i++) {
            if (lengthShelves < books[i].getBookInfoLength()) {
                lengthShelves = books[i].getBookInfoLength();
            }
        }
    }

    // получить все книги (только для визуализации шкафа)
    public Book[] getAllBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    // получить количество свободных полок
    public int getCountFreeBookShelfs() {
        return CAPACITY - countBooks;
    }

    // очистить шкаф
    public void clearBookShelf() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
    }
}