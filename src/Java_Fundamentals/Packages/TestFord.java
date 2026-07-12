package Java_Fundamentals.Packages;

public class TestFord {

    public static void main(String[] args) {

        Ford f = new Ford();

        System.out.println("Model Name : " + f.getModelName());
        System.out.println("Registration Number : " + f.getRegistrationNumber());
        System.out.println("Owner Name : " + f.getOwnerName());
        System.out.println("Speed : " + f.getSpeed());

        f.tempControl();
    }
}