package Java_Fundamentals.Packages;

public class TestVehicle {

    public static void main(String[] args) {

        Hero h1 = new Hero();
        System.out.println("Hero Bike");
        System.out.println("Model: " + h1.getModelName());
        System.out.println("Reg No: " + h1.getRegistrationNumber());
        System.out.println("Owner: " + h1.getOwnerName());
        System.out.println("Speed: " + h1.getSpeed());
        h1.radio();

        System.out.println();

        Honda h2 = new Honda();
        System.out.println("Honda Car");
        System.out.println("Model: " + h2.getModelName());
        System.out.println("Reg No: " + h2.getRegistrationNumber());
        System.out.println("Owner: " + h2.getOwnerName());
        System.out.println("Speed: " + h2.getSpeed());
        h2.cdplayer();
    }
}