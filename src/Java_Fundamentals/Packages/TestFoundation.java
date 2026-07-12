package Java_Fundamentals.Packages;

public class TestFoundation {
    public static void main(String[] args) {
        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // Private - Not accessible
        System.out.println("var2 = " + obj.var2);
        System.out.println("var3 = " + obj.var3);
        System.out.println("var4 = " + obj.var4);
    }
}