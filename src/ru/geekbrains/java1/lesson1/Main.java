package ru.geekbrains.java1.lesson1;

public class Main {

    private static void init(){
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 41111111111111l;

        float f = 1.1f;
        double d = 1.1;

        boolean bool = true;
        char c = 'c';
    }

    private static float calculate(float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    private static boolean checkSum(int first, int second){
        return (first + second) >= 10 && (first + second) <= 20;
    }

    private static void lessOrGreaterZero(int number){
        if (number >= 0){
            System.out.println("positive");
        }else {
            System.out.println("negative");
        }
    }

    private static boolean numberTransfer(int number){
        if (number < 0){
            return true;
        }
        return false;
    }

    private static void hello(String name){
        System.out.println("Hello " + name);
    }

    private static void leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("leap");
        }else {
            System.out.println("no leap");
        }
    }



    public static void main(String[] args) {
        System.out.println(calculate(1.0f, 1.1f, 3, 6));
        System.out.println(checkSum(0 , 9));
        lessOrGreaterZero(-1);
        System.out.println(numberTransfer(-1));
        hello("name");
        leapYear(2003);

    }
}
