package ru.geekbrains.java1.lesson6.Animals;

public class Cat extends Animal {
    public Cat(String name) {
        super("cat",name, (int) (Math.random() * 250), 0, (int) (Math.random() * 250));
    }
}
