package Java_Fundamentals.OOPS.Abstraction;

public class BookDemo {

    public static void main(String[] args) {

        Author author = new Author("James Gosling", "james@gmail.com", 'M');

        Book book = new Book("Java Programming", author, 599.50, 20);

        System.out.println(book);
    }
}