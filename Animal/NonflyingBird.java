package Animal;

public class NonflyingBird extends Bird {



    public NonflyingBird(String name, int age, String environment, String movement) {
        super(name, age, environment);

    }

    @Override
    public void eat() {
        System.out.println("Нелетающая птица питается на земле");

    }

    @Override
    public void sleep() {
        System.out.println("Нелетающая птица спит на земле");


    }

    @Override
    public void go() {
        System.out.println("Нелетающая птица перемещается по"+ getMovement());

    }

    @Override
    public void hunt() {
        System.out.println("Нелетающая птица охотится на земле" );

    }

    @Override
    public String toString() {
        return "NonflyingBird{} " + super.toString();
    }
}
