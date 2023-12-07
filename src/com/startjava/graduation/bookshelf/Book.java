package com.startjava.graduation.bookshelf;

public class Book {
    private static final int COUNT_PARTS = 3;
    private static final String PARTS_FORMAT_EXCEPTION_MSG = """
            Ошибка формата:
            Должно быть: автор, название, год издания
            """;
    public static final String YEAR_FORMAT_EXCEPTION_MSG = """
            Ошибка формата:
            Год издания должен быть число от 0 до 2100
            """;

    private static final int MAX_VALID_YEAR = 2100;
    private final String author;
    private final String title;
    private final int yearOfPublication;

    private final int bookInfoLength;

    public Book(String description) {
        String[] descriptionParts = description.split(", ");

        if (descriptionParts.length != COUNT_PARTS) {
            throw new RuntimeException(PARTS_FORMAT_EXCEPTION_MSG);
        }
        int bookInfoLength = description.length();
        String author = descriptionParts[0];
        String title = descriptionParts[1];
        try {
            int yearOfPublication = Integer.parseInt(descriptionParts[2]);
            if (yearOfPublication < 0 || yearOfPublication > MAX_VALID_YEAR) {
                throw new RuntimeException(YEAR_FORMAT_EXCEPTION_MSG);
            }
            this.yearOfPublication = yearOfPublication;
        } catch (NumberFormatException ignored) {
            throw new RuntimeException(YEAR_FORMAT_EXCEPTION_MSG);
        }

        this.author = author;
        this.title = title;
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
