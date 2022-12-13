package Animal;

import java.util.Objects;

public abstract class Mammal extends Animal{
    private String environment;
    private int speed;
    private String food;

    public Mammal(String name,
                  int age,
                  String environment,
                  int speed,
                  String food) {
        super(name, age);
        this.environment = environment;
        this.speed = speed;
        this.food = food;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public abstract void walk();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;}
        Mammal mammal = (Mammal) o;
        return speed == mammal.speed && Objects.equals(environment, mammal.environment) && Objects.equals(food, mammal.food);
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "environment='" + environment + '\'' +
                ", speed=" + speed +
                ", food='" + food + '\'' +
                "} " + super.toString();
    }
}
