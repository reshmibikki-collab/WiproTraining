package Java_Fundamentals.Packages;

public class TestHero {

    public static void main(String[] args) {

        Hero hero = new Hero();

        System.out.println("Model Name : " + hero.getModelName());
        System.out.println("Registration Number : " + hero.getRegistrationNumber());
        System.out.println("Owner Name : " + hero.getOwnerName());
        System.out.println("Speed : " + hero.getSpeed());

        hero.radio();
    }
}