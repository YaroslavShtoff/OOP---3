package Animal;

public class Main {
    public static void main(String[] args) {
        Animal gazelle = new Herbivoruse("Газель", 7, "земля", 80, "трава");
        Animal gazelle1 = new Herbivoruse("Газель", 7, "земля", 80, "трава");
        Animal giraffe = new Herbivoruse("Жираф", 11, "земля", 60, "листья");
        Animal horse = new Herbivoruse("Лошадь", 14, "земля", 75, "сено");
        Animal hyena = new Predator("Гиена", 4, "земля", 35, "падаль");
        Animal lion = new Predator("Тигр", 9, "земля", 50, "мясо");
        Animal bear = new Predator("Медведь", 6, "земля", 55, "мясо");
        Animal frog = new Amphibian("Лягушка", 1, "вода");
        Animal grassSnake = new Amphibian("Уж пресноводный", 2, "вода");
        Animal peacock = new NonflyingBird("Павлин", 3, "земля", "ногами");
        Animal penguin = new NonflyingBird("Пингвин", 5, "земля", "ногами");
        Animal dodo = new NonflyingBird("Додо", 2, "земля", "ногами");
        Animal gull = new FlyingBird("Чайка", 1, "воздух", "крыльями");
        Animal albatross = new FlyingBird("Альбатрос", 8, "воздух", "крыльями");
        Animal falcon = new FlyingBird("Сокол", 12, "воздух", "крыльями");

        System.out.println(gazelle);
        System.out.println(giraffe);
        System.out.println(horse);
        System.out.println(hyena);
        System.out.println(lion);
        System.out.println(bear);
        System.out.println(frog);
        System.out.println(grassSnake);
        System.out.println(peacock);
        System.out.println(penguin);
        System.out.println(dodo);
        System.out.println(gull);
        System.out.println(albatross);
        System.out.println(falcon);
        System.out.println(falcon.equals(albatross));
        System.out.println(albatross.equals(gull));
        System.out.println(falcon.equals(gull));
        System.out.println(gazelle.equals(horse));
        System.out.println(gazelle.equals(horse));






        }
    }
