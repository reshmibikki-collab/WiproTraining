package Java_Fundamentals.Multithreading;

public class Assignment2 {

    public static void main(String[] args) {

        // Thread 1: Prints even numbers
        Thread evenThread = new Thread(() -> {

            for (int i = 2; i <= 20; i += 2) {
                System.out.print(i + " ");
            }

            System.out.println();

        });


        // Thread 2: Prints odd numbers
        Thread oddThread = new Thread(() -> {

            for (int i = 1; i <= 20; i += 2) {
                System.out.print(i + " ");
            }

            System.out.println();

        });


        // Start even thread first
        evenThread.start();

        try {
            // Wait for even thread to finish
            evenThread.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }


        // Start odd thread after even thread completes
        oddThread.start();
    }
}