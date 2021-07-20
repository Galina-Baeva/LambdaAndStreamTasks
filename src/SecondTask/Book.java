package SecondTask;

public class Book {
    protected String title;
    protected Author author;
    protected Double price;

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

    public void bookDescription() {
        System.out.println("Title: '" + title + "'");
        author.printAuthorName();
        System.out.println("price: " + price);
    }

}
