package com.rise1116.library.domain

class Book {

    String title
    Integer pages
    Double price
    List<Author> authors = []


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", authors=" + authors +
                '}';
    }
}
