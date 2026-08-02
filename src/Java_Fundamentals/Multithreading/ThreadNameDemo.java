package Java_Fundamentals.Multithreading;

public class ThreadNameDemo {

    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            System.out.println("Running thread: "
                    + Thread.currentThread().getName());
        }, "Scooby");

        Thread thread2 = new Thread(() -> {
            System.out.println("Running thread: "
                    + Thread.currentThread().getName());
        }, "Shaggy");

        thread1.start();
        thread2.start();
    }
}