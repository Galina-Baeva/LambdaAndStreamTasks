package SecondTask;

import FirstTask.Person;

public class Author {
    String firstName;
    String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int compareTo(Author author) {
        return (firstName + lastName).compareTo(author.firstName + author.lastName);
    }

    void printAuthorName() {
        System.out.println("Author: " + firstName + " " + lastName);
    }

}
