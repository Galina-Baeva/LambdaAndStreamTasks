package SecondTask;

import FirstTask.Person;

public class Book {
    String title;
    Author author;
    Double price;

    public Book(String title, Author author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Double getPrice() {
        return price;
    }

    void bookDescription() {
        System.out.println("Title: '" + title + "'");
        author.printAuthorName();
        System.out.println("price: " + price);
    }

}
