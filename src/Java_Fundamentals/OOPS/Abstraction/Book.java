package Java_Fundamentals.OOPS.Abstraction;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    @Override
    public String toString() {
        return "Book[name=" + name +
                ", author=" + author +
                ", price=" + price +
                ", qtyInStock=" + qtyInStock + "]";
    }
}