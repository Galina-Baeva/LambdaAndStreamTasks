package SecondTask;

public class Author {
    protected String firstName;
    protected String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    public void printAuthorName() {
        System.out.println("Author: " + firstName + " " + lastName);
    }

}
