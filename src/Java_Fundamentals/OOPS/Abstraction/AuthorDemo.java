package Java_Fundamentals.OOPS.Abstraction;

public class AuthorDemo {

    public static void main(String[] args) {

        Author author = new Author("James Gosling", "james@example.com", 'M');

        System.out.println(author);

        author.setEmail("gosling@gmail.com");

        System.out.println(author);
    }
}