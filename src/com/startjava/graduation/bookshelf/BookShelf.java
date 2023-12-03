package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {
    private static final int BOOKSHELF_SIZE = 10;
    private int countBooks;
    private Book[] books;

    private int maxLengthLine;

    public BookShelf() {
        countBooks = 0;
        books = new Book[BOOKSHELF_SIZE];
        maxLengthLine = 0;
    }

    public int getMaxLengthLine() {
        return maxLengthLine;
    }

    // добавить книгу
    public boolean addBook(Book book) {
        if (countBooks >= 0 && countBooks < BOOKSHELF_SIZE) {
            books[countBooks++] = book;
            if (maxLengthLine < book.getBookInfoLength()) {
                maxLengthLine = book.getBookInfoLength();
            }
            return true;
        }

        if (countBooks >= BOOKSHELF_SIZE) {
            System.out.println("Шкаф заполнен. Для добавления сначала удалите какую нибудь книгу");
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
//                for (int j = i + 1; j < countBooks) {
//                    books[j - 1] = books[j];
//                }
                if (i < countBooks - 1) {
                    System.arraycopy(books, i + 1, books, i,countBooks - i);
                }
                books[countBooks - 1] = null;
                countBooks--;

                maxLengthLine = 0;
                for (int j = 0; j < countBooks; j++) {
                    if (maxLengthLine < books[j].getBookInfoLength()) {
                        maxLengthLine = books[j].getBookInfoLength();
                    }
                }

                return true;
            }
        }

        return false;
    }

    // получить все книги (только для визуализации шкафа)
    public Book[] getAllBooks() {
        return books;
    }

    // получить количество книг в шкафу
    public int getCountBook() {
        return countBooks;
    }

    // получить количество свободных полок
    public int getCountFreeBookShelfs() {
        return BOOKSHELF_SIZE - countBooks;
    }


    // очистить шкаф
    public void clearBookShelf() {
//        books = new Book[BOOKSHELF_SIZE];
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }
        countBooks = 0;
    }
}


