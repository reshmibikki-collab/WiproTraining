package Java_Fundamentals.Packages;

public class Hero extends Vehicle {

    @Override
    public String getModelName() {
        return "Hero Splendor";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39AB1234";
    }

    @Override
    public String getOwnerName() {
        return "Reshmitha";
    }

    public int getSpeed() {
        return 80;
    }

    public void radio() {
        System.out.println("Radio is ON");
    }
}