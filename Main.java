import transport.Bus;
import transport.Car;
import transport.Train;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       /* Human maxim = new Human(LocalDate.now().getYear() - 35, " Максим ", " Минск",
                "бренд-менеджера ");
        maxim.life();

        Human anny = new Human(LocalDate.now().getYear() - 29, " Аня ", " Москва",
                "методиста образовательных программ");
        anny.life();

        Human katy = new Human(LocalDate.now().getYear() - 28, " Катя ", " Калиниград",
                "продакт-менеджера ");
        katy.life();

        Human anton = new Human(LocalDate.now().getYear() - 27, " Антон ", " Москва",
                " директора по развитию бизнеса ");
        anton.life();

        Human vladimir = new Human(LocalDate.now().getYear() - 21, " Владимир ", " Казань ",
                " не работаю ");
        vladimir.life();*/


        Car lada = new Car("Lada",
                "Grande",
                "желтый",
                0,
                2015,
                "Россия",
                1.7,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                46);
        lada.carID();

        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                "черный",
                0,
                2020,
                "Германия",
                3.0,
                null,
                0,
                null,
                null,
                true,
                "дизель",
                72);
        audi.carID();
        Car bmw = new Car("BMW ",
                "Z8",
                "черный",
                0,
                2021,
                "Германия",
                3.0,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                98);

        bmw.carID();

        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                "красный",
                0,
                2018,
                "Южная Корея",
                2.4,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                88);
        kia.carID();

        Car hyndai = new Car("Hyundai",
                "Avante",
                "оранжевый",
                0 ,
                2016,
                "Южная Корея",
                0,
                null,
                0,
                null,
                null,
                true,
                "бензин",
                15);
        hyndai.carID();


       /* Flower rose = new Flower("", "Голландия", 35.39, 0);
        Flower chrysanthemum = new Flower("", null, 15, 5);
        Flower peony = new Flower("", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("", "Турция ", 19.5, 10);


        Bouquet bouquet = new Bouquet(
                new Flower[]{
                        rose,rose,rose,
                        chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,chrysanthemum,
                        gypsophila,
                }
        );
        bouquet.printInfo();*/

        Train lastochka = new Train(
                "Ласточка",
                "В-901",
                null,
                2011,
                "Россия",
                305,
                3500,
                11,
                "Белоруский вокзал",
                "Минск-Пасажирский",
                11,
                "дизель",
                11);

        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                null,
                2019,
                "Россия",
                270,
                1700,
                5,
                "Ленингралский вокзал",
                "Ленинград - Пассажирский",
                8,
                "дизель",
                61);


        System.out.println(lastochka);
        System.out.println(leningrad);


        Bus volgograd = new Bus("Вольво",
                "Ф-115",
                "красный",
                2002,
                "Швеция",
                188,
                "дизель",
                800,
                8,
                "Волгоград-1",
                "автовокзал Элиста",
                100);

        Bus rostov = new Bus("Паз",
                "Т11",
                "желтый",
                2022,
                "Россия",
                100,
                "бензин",
                400,
                4,
                "Ростовский автовокзал",
                "Шахты",
                23);

        Bus krasnodar = new Bus("Ниссан",
                "екх",
                "синий",
                2015,
                "Япония",
                240,
                "дизель",
                680,
                6,
                "АС Краснодар",
                "автовокзал Сочи",
                65);
        System.out.println(volgograd);
        System.out.println(rostov);
        System.out.println(krasnodar);



    }


}



