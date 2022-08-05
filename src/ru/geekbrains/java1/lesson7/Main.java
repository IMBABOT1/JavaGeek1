package ru.geekbrains.java1.lesson7;

public class Main{
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("first"),
                new Cat("second"),
                new Cat("third")
        };

        Plate plate = new Plate(5);

        plate.addFood(100);

        for (Cat c : cats){
            c.eat(plate);
        }
        for (Cat c : cats){
            System.out.println(c.getSatiety());
        }

    }
}
