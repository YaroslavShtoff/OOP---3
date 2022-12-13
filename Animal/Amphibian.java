package Animal;

public class Amphibian extends Animal{
    public Amphibian(String name, int age, String environment) {
        super(name, age, environment);
    }

    public Amphibian(String name, int age) {
        super(name, age);
    }
    public void hunt() {
        System.out.println("Земноводное охотиться рядом с водоемом");
    }

    @Override
    public void eat() {
        System.out.println("Земноводное ест насекомыхи мелких млекопитающих");


    }

    @Override
    public void sleep() {
        System.out.println("Земноводное спит днем и ночью");


    }

    @Override
    public void go() {
        System.out.println("Земноводное плавает");

    }

}
