package ru.geekbrains.java1.lesson5;

public class Employee {

    private String name;
    private String function;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public int getAge(){
        return age;
    }


    public Employee(String name, String function, String email, int phone, int salary, int age) {
        this.name = name;
        this.function = function;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.println("name: " + name + " " + "function: " + function + " " + "mail: " + email + " " + "phone: " + phone + " " + "salary: " + salary + " " + "age: " + age);
    }
}
