package Animal;

public  class Herbivoruse extends Mammal{
    public Herbivoruse(String name,
                       int age,
                       String environment,
                       int speed,
                       String food) {
        super(name, age, environment, speed, food);
    }

    public void graze() {
        System.out.println("Травоядное пасется");
    }


    @Override
    public void eat() {
        System.out.println("Травоядное питается" + getFood());

    }

    @Override
    public void sleep() {
        System.out.println("Травоядное спит ночью");

    }

    @Override
    public void go() {
        System.out.println("Травоядное идет");

    }

    @Override
    public void walk() {
        System.out.println("Травоядное умеет ходить");

    }

}
