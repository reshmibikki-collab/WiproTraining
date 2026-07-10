package Java_Fundamentals.OOPS.ClassesAndObjects;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double getVolume() {
        return width * height * depth;
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box(10, 20, 15);
        System.out.println("The volume of the box is: " + myBox.getVolume());
    }
}