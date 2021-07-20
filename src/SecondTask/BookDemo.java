package SecondTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookDemo {
    public static void main(String[] args) {
        Author author1 = new Author("Russel", "Winderand");
        Author author2 = new Author("Aleksandr", "Pushkin");
        Author author3 = new Author("Lev", "Tolstoy");
        Author author4 = new Author("Edith", "Eger");

        List<Book> setOfBooks = new ArrayList<>();

        setOfBooks.add(new Book("Developing Java Software", author1, 79.75));
        setOfBooks.add(new Book("Eugene Onegin", author2, 49.37));
        setOfBooks.add(new Book("The Tale of Tsar Saltan", author2, 25.12));
        setOfBooks.add(new Book("War and Peace", author3, 83.00));
        setOfBooks.add(new Book("Anna Karenina", author3, 68.99));
        setOfBooks.add(new Book("Resurrection", author3, 54.50));
        setOfBooks.add(new Book("The Choice", author4, 33.28));
        setOfBooks.add(new Book("The Gift", author4, 44.80));

        Book book = setOfBooks.stream().max(Comparator.comparing(Book::getPrice)).get();
        book.bookDescription();

        String booksOfCertainAuthor = setOfBooks.stream()
                .filter(a -> a.getAuthor() == author3)
                .map(Book::getTitle)
                .collect(Collectors.joining(" "));
        System.out.println(booksOfCertainAuthor);

        List<Book> sortedBooks = setOfBooks.stream()
                .sorted(Comparator.comparing(a -> a.getAuthor().toString()))
                .collect(Collectors.toList());

        sortedBooks.forEach(Book::bookDescription);

        Double sum = setOfBooks.stream()
                .map(Book::getPrice).mapToDouble(Double::doubleValue).sum();
        System.out.print(sum);


    }
}