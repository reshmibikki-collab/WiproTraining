package Java_Fundamentals.Multithreading;

public class Assignment3 {

    public static void main(String[] args) {

        // Create worker task
        Runnable task = () -> {

            String name = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();

            System.out.println(name + " (Priority: " + priority + ") started.");

            // Dummy workload
            for (int i = 0; i < 5; i++) {
                System.out.println(name + " processing step " + i);
            }

            System.out.println(name + " completed.");
        };


        // Create threads
        Thread t1 = new Thread(task, "Thread-MAX");
        Thread t2 = new Thread(task, "Thread-NORM");
        Thread t3 = new Thread(task, "Thread-MIN");


        // Set priorities
        t1.setPriority(Thread.MAX_PRIORITY);   // 10
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MIN_PRIORITY);   // 1


        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}