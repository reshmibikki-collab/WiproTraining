package Java_Fundamentals.Multithreading;

public class Assignment1 {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {

            for (int i = 1; i <= 10; i++) {

                System.out.println(i);

                if (i == 5) {

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted");
                    }
                }
            }

        });

        thread.start();
    }
}