package Java_Fundamentals.OOPS.Polymorphism;

class Fruit {

    String name;
    String taste;
    String size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste + ".");
    }
}

class Apple extends Fruit {

    Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    void eat() {
        System.out.println("This " + size + " apple is crunchy and " + taste + ".");
    }
}

class Orange extends Fruit {

    Orange(String size) {
        super("Orange", "tangy", size);
    }

    @Override
    void eat() {
        System.out.println("This " + size + " orange is juicy and " + taste + ".");
    }
}

public class FruitDemo {

    public static void main(String[] args) {

        Fruit fruit;

        fruit = new Apple("Large");
        fruit.eat();

        fruit = new Orange("Medium");
        fruit.eat();
    }
}