package ru.geekbrains.java1.lesson6;

import ru.geekbrains.java1.lesson6.Animals.Animal;
import ru.geekbrains.java1.lesson6.Animals.Cat;
import ru.geekbrains.java1.lesson6.Animals.Dog;

public class Main {

    public static void main(String[] args) {
        Animal[] animals =new Animal[]{
                new Cat("Cat1"),
                new Dog("Dog1")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(111);
            animals[i].swim(10);
            animals[i].jump(1111);
        }


    }
}
