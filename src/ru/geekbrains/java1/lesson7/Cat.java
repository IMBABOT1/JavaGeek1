package ru.geekbrains.java1.lesson7;

public class Cat {
    private String name;
    private boolean satiety;
    private int foodAmount;


    public boolean getSatiety(){
        return satiety;
    }


    public Cat(String name) {
        this.name = name;
        this.satiety = false;
        this.foodAmount = 10;
    }

    public void eat(Plate p) {
        if (p.getFood() > foodAmount) {
            System.out.println(name + " кушает");
            p.decreaseFood(10);
            satiety = true;
        }else {
            System.out.println("not enough food");
            satiety = false;
        }
    }
}

