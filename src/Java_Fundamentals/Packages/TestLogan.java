package Java_Fundamentals.Packages;

public class TestLogan {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("Model Name : " + l.getModelName());
        System.out.println("Registration Number : " + l.getRegistrationNumber());
        System.out.println("Owner Name : " + l.getOwnerName());
        System.out.println("Speed : " + l.getSpeed());

        l.gps();
    }
}