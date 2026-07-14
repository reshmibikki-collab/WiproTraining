package Java_Fundamentals.InterfaceNewFeatures;

interface Test {
    int myFunction(int a, int b, int c);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {

        Test t1 = (a, b, c) -> a + b + c;
        Test t2 = (a, b, c) -> a * b * c;

        System.out.println("Addition Result (t1): " + t1.myFunction(10, 20, 30));
        System.out.println("Multiplication Result (t2): " + t2.myFunction(10, 20, 30));
    }
}