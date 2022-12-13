package Animal;

public class Predator extends Mammal{
    public Predator(String name,
                    int age,
                    String environment,
                    int speed,
                    String food) {
        super(name, age, environment, speed, food);
    }
    public void meat() {
        System.out.println("Хищник охотиться");
    }

    @Override
    public void eat() {
        System.out.println("Хищник  питается" + getFood());

    }

    @Override
    public void sleep() {
        System.out.println("Хищник  спит днем");

    }

    @Override
    public void go() {
        System.out.println("Хищник бежит");
    }

    @Override
    public void walk() {
        System.out.println("Хищник  идет по лесу ");

    }
}
