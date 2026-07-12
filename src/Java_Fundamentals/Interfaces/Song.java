package Java_Fundamentals.Interfaces;

public class Song implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Song");
    }

    public static void main(String[] args) {

        Song s = new Song();
        s.play();

    }
}