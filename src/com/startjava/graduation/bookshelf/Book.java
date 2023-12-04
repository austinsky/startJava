package com.startjava.graduation.bookshelf;

public class Book {
    private static final int BOOKINFO_COUNT_PART = 3;
    private static final String ERROR_NUMBER_ARGUMENTS_FORMAT_EXCEPTION = """
                                                                            Ошибка формата:
                                                                            Должно быть: автор, название, год издания
                                                                          """;
    private static final String ERROR_PARSE_YEAR_EXCEPTION = """
                                                               Ошибка формата:
                                                               Год издания должен быть числов от 1900 до 2100
                                                             """;
    private final String author;
    private final String title;
    private final int yearOfPublication;

    private final int bookInfoLength;


    public Book(String bookDescription) {
        String[] bookDescriptionParts = bookDescription.split(", ");
        String author = null;
        String title = null;
        int yearOfPublication = 0;
        int bookInfoLength = 0;

        try {
            if (bookDescriptionParts.length != 3) {
                throw new RuntimeException(ERROR_NUMBER_ARGUMENTS_FORMAT_EXCEPTION);
            }
            author = bookDescriptionParts[0];
            title = bookDescriptionParts[1];
            yearOfPublication = Integer.parseInt(bookDescriptionParts[2]);
            bookInfoLength = bookDescription.length();
            if (yearOfPublication < 0 || yearOfPublication > 2100) {
                throw new NumberFormatException();
            }

        } catch (NumberFormatException ignored) {
            System.out.println(ERROR_PARSE_YEAR_EXCEPTION);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
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
