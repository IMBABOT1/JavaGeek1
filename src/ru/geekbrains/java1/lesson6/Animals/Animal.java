package ru.geekbrains.java1.lesson6.Animals;

public abstract class Animal {

    private String type;
    private String name;
    private int runDistance;
    private int swimDistance;
    private int jumpHeight;

    public Animal(String type, String name, int runDistance, int swimDistance, int jumpHeight) {
        this.type = type;
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        this.jumpHeight = jumpHeight;
    }


    public void run(int length) {
        if (runDistance >= length) {
            System.out.println(type + " " + "name " + name + " " + runDistance + " " + "success");
        }else {
            System.out.println(type + " " + "name " + name + " " + runDistance + " " + "failed");
        }
    }

    public void swim(int length) {
        if (swimDistance == 0){
            System.out.println(type + " " + "can't swim");
            return;
        }
        if (swimDistance >= length) {
            System.out.println(type + " " + "name " + name + " " + swimDistance + " " + "success");
        }else {
            System.out.println(type + " " + "name " + name + " " + swimDistance + " " + "failed");
        }
    }

    public void jump(int height) {
        if (jumpHeight >= height) {
            System.out.println(type + " " + "name " + name + " " + jumpHeight + " " + "success");
        } else {
            System.out.println(type + " " + "name " + name + " " + jumpHeight + " " + "failed");
        }
    }
}
