package ru.geekbrains.java1.lesson7;


public class Plate {
    private int food;

    public int getFood(){
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount > food){
            System.out.println("not enough food");
        }else {
            food -= amount;
        }
    }

    public void addFood(int amount){
        food += amount;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Food: " + food);
    }
}
