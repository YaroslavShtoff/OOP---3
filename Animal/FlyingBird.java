package Animal;

public class FlyingBird extends Bird{

    public FlyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment);

    }

    @Override
    public void eat() {
        System.out.println("Летающая птица питается в воздухе");

    }

    @Override
    public void sleep() {
        System.out.println("Летающая птица спит днем или ночью");


    }

    @Override
    public void go() {
        System.out.println("Летающая птица перемещается"+ getMovement());

    }

    @Override
    public void hunt() {
        System.out.println("Летающая птица охотится в небе" );

    }

    @Override
    public String toString() {
        return "FlyingBird{} " + super.toString();
    }
}


