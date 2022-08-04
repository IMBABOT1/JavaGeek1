package ru.geekbrains.java1.lesson5;

public class Main {

    public static void main(String[] args) {
       Employee[] employees = new Employee[5];
       employees[0] = new Employee("name1", "function1", "mail@mail.com", 880000000, 150, 20);
       employees[1] = new Employee("name2", "function2", "mail1@mail.com", 880000001, 250, 45);
       employees[2] = new Employee("name3", "function3", "mail2@mail.com", 880000002, 350, 77);
       employees[3] = new Employee("name4", "function4", "mail3@mail.com", 880000003, 450, 35);
       employees[4] = new Employee("name5", "function5", "mail4@mail.com", 880000004, 650, 30);

        for (int i = 0; i < employees.length ; i++) {
            if (employees[i].getAge() > 40){
                employees[i].info();
            }
        }
    }
}
