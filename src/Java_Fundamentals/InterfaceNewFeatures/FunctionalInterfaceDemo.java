package Java_Fundamentals.InterfaceNewFeatures;

interface Test {
    int myFunction(int a, int b, int c);
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {

        Test obj = (a, b, c) -> a + b + c;

        System.out.println("Result = " + obj.myFunction(10, 20, 30));
    }
}