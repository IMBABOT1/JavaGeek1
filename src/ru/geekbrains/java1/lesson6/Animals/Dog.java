package ru.geekbrains.java1.lesson6.Animals;

public class Dog extends Animal{


    public Dog(String name) {
        super("dog", name, (int) (Math.random() * 250), (int) (Math.random() * 250), (int) (Math.random() * 250));
    }
}
