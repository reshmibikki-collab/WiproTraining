package Java_Fundamentals.OOPS.Inheritance;

// Parent class
class Animal {

    void eat() {
        System.out.println("This animal eats food.");
    }

    void sleep() {
        System.out.println("This animal sleeps.");
    }
}

// Child class
class Bird extends Animal {

    @Override
    void eat() {
        System.out.println("The bird pecks at seeds.");
    }

    @Override
    void sleep() {
        System.out.println("The bird sleeps in a nest.");
    }

    void fly() {
        System.out.println("The bird is flying high.");
    }
}

public class AnimalDemo {

    public static void main(String[] args) {

        System.out.println("--- Animal Object ---");
        Animal myAnimal = new Animal();
        myAnimal.eat();
        myAnimal.sleep();

        System.out.println();

        System.out.println("--- Bird Object ---");
        Bird myBird = new Bird();
        myBird.eat();
        myBird.sleep();
        myBird.fly();
    }
}