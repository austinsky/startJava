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

    private String author;
    private String title;
    private int yearOfPublication;

    private int bookInfoLength;


    private Book(String author, String title, int yearOfPublication, int bookInfoLength) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.bookInfoLength = bookInfoLength;
    }

    public static Book createBook(String bookDescription) {
        String[] bookDescription_parts = bookDescription.split(", ");

        try {
            if (bookDescription_parts.length != 3) {
                throw new RuntimeException(ERROR_NUMBER_ARGUMENTS_FORMAT_EXCEPTION);
            }
            String author = bookDescription_parts[0];
            String title = bookDescription_parts[1];
            int yearOfPublication = Integer.parseInt(bookDescription_parts[2]);
            int bookInfoLength = bookDescription.length();
            if (yearOfPublication < 0 || yearOfPublication > 2100) {
                throw new NumberFormatException();
            }
            return new Book(author, title, yearOfPublication, bookInfoLength);
        } catch (NumberFormatException ignored) {
            System.out.println(ERROR_PARSE_YEAR_EXCEPTION);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getBookInfoLength() {
        return bookInfoLength;
    }


    @Override
    public String toString() {
        return String.format("%S, %s, %s", author, title, yearOfPublication);
    }
}
