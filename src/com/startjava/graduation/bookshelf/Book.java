package com.startjava.graduation.bookshelf;

public class Book {
    private static final int COUNT_PARTS = 3;
    private static final String PARTS_FORMAT_EXCEPTION_MSG = """
        Ошибка формата:
        Должно быть: автор, название, год издания
        """;
    public static final String YEAR_FORMAT_EXCEPTION_MSG = """
        Ошибка формата:
        Год издания должен быть числов от 1900 до 2100
        """;

    private static final int MAX_VALID_YEAR = 2100;
    private final String author;
    private final String title;
    private final int yearOfPublication;

    private final int bookInfoLength;

    public Book(String description) {
        String[] descriptionParts = description.split(", ");
        String author = null;
        String title = null;
        int yearOfPublication = 0;
        int bookInfoLength = 0;


        if (descriptionParts.length != COUNT_PARTS) {
            throw new RuntimeException(PARTS_FORMAT_EXCEPTION_MSG);
        }
        author = descriptionParts[0];
        title = descriptionParts[1];
        yearOfPublication = Integer.parseInt(descriptionParts[2]);
        bookInfoLength = description.length();
        if (yearOfPublication < 0 || yearOfPublication > MAX_VALID_YEAR) {
            throw new NumberFormatException();
        }

        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.bookInfoLength = bookInfoLength;
    }

    public String getTitle() {
        return title;
    }

    public int getBookInfoLength() {
        return bookInfoLength;
    }

    @Override
    public String toString() {
        return String.format("%S, %s, %s", author, title, yearOfPublication);
    }
}
