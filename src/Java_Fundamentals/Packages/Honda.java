package Java_Fundamentals.Packages;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda City";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Reshmitha";
    }

    public int getSpeed() {
        return 120;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}