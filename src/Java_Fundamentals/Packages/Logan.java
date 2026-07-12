package Java_Fundamentals.Packages;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39LG1234";
    }

    @Override
    public String getOwnerName() {
        return "Reshmitha";
    }

    public int getSpeed() {
        return 100;
    }

    public void gps() {
        System.out.println("GPS is ON");
    }
}