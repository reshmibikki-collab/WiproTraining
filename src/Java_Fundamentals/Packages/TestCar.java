package Java_Fundamentals.Packages;

public class TestCar {

    public static void main(String[] args) {

        Logan l = new Logan();

        System.out.println("Logan");
        System.out.println("Model: " + l.getModelName());
        System.out.println("Reg No: " + l.getRegistrationNumber());
        System.out.println("Owner: " + l.getOwnerName());
        System.out.println("Speed: " + l.getSpeed());
        l.gps();

        System.out.println();

        Ford f = new Ford();

        System.out.println("Ford");
        System.out.println("Model: " + f.getModelName());
        System.out.println("Reg No: " + f.getRegistrationNumber());
        System.out.println("Owner: " + f.getOwnerName());
        System.out.println("Speed: " + f.getSpeed());
        f.tempControl();
    }
}