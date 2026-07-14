package Java_Fundamentals.InterfaceNewFeatures;

// 1. Create interface Vehicle
interface Vehicle {
    default void message() {
        System.out.println("Inside Vehicle");
    }
}

// 2. Create interface FourWheeler
interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}

// 3. Create class Car implementing these two interfaces
class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message();
    }
}

public class VehicleDefaultDemo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.message();
    }
}