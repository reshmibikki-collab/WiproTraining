package Java_Fundamentals.OOPS.Inheritance;

public class PersonDemo {

    public static void main(String[] args) {

        Person person = new Person("Reshmitha");

        System.out.println("Name: " + person.getName());

        person.setName("Sai Reshmitha");

        System.out.println("Updated Name: " + person.getName());
    }
}