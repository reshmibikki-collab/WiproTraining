package Java_Fundamentals.Packages;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39FD5678";
    }

    @Override
    public String getOwnerName() {
        return "Reshmitha";
    }

    public int getSpeed() {
        return 120;
    }

    public void tempControl() {
        System.out.println("Air Conditioner is ON");
    }
}