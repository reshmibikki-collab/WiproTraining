package Java_Fundamentals.Multithreading;

import java.util.Random;

public class ColorDisplayTask implements Runnable {

    private final String[] colors = {
        "white", "blue", "black", "green", "red", "yellow"
    };

    private final Random random = new Random();

    @Override
    public void run() {

        while (true) {

            int randomIndex = random.nextInt(colors.length);
            String selectedColor = colors[randomIndex];

            System.out.println("Color: " + selectedColor);

            if ("red".equalsIgnoreCase(selectedColor)) {
                System.out.println("Red encountered. Stopping display.");
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                break;
            }
        }
    }

    public static void main(String[] args) {

        ColorDisplayTask task = new ColorDisplayTask();

        Thread colorThread = new Thread(task);
        colorThread.start();
    }
}