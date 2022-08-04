package ru.geekbrains.java1.lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random random = new Random();
    private static Scanner sc = new Scanner(System.in);


    private static void again(){
        System.out.println("press y to play again, press n to quite");
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);

        while (c != 'y' || c != 'n'){
            if (c == 'y'){
                guessNumber();
            }else if (c == 'n'){
                System.out.println(312);
                return;
            }
        }

        System.out.println(c);
    }

    private static void guessNumber(){
        int rnd = random.nextInt((9 - 0) + 1) + 0;
        int amount = 3;

        System.out.println(rnd);
        System.out.println("Guess number");

        while (amount > 0){
            int guess = sc.nextInt();

            if (guess == rnd) {
                System.out.println("win");
                again();
            }else if (guess > rnd){
                amount--;
                System.out.println("Number is less, you got " + amount + " tries");

                if (amount == 0){
                    again();
                }

            }else if (guess < rnd){
                amount--;
                System.out.println("Number is greater, you got " + amount + " tries");

                if (amount == 0){
                    again();
                }

            }
        }
    }

    private static void guessWord() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        String word = words[random.nextInt(words.length)];
        System.out.println(word);
        System.out.println("guess word");
        String temp = "###############";

        String[] tempArr = temp.split("");

        while (true) {
            String guessWord = scanner.nextLine();
            if (guessWord.equals(word)) {
                System.out.println("win");
                break;
            } else {
                for (int i = 0; i < guessWord.length(); i++) {
                    if (guessWord.charAt(i) == word.charAt(i)) {
                        tempArr[i] = String.valueOf(guessWord.charAt(i));
                    }
                }

                String str = String.join(",", tempArr);
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        //guessNumber();
          guessWord();
    }
}
