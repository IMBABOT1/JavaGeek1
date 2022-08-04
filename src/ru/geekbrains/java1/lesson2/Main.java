package ru.geekbrains.java1.lesson2;

import java.util.Arrays;

public class Main {

    private static void fillArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                arr[i] = 0;
            }else if (arr[i] == 0){
                arr[i] = 1;
            }
        }
    }
    private static void fillWithNumbers(){
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    private static void lessThanSix(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void fillDiagonalElements(){
        int[][] arr = new int[5][5];
        int length = arr.length - 1;

        for (int i = 0; i < arr.length ; i++) {
             arr[i][i] = 1;
             arr[i][length] = 1;
             length--;
        }
    }

    private static int findMinElement(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    private static int findMaxElement(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static boolean checkBalance(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++){
                sum += nums[j];
            }
            for (int j = i; j < nums.length; j++){
                sum -= nums[j];
            }
            if (sum == 0)
                return true;
        }
        return false;
    }

    private static int[] shiftElements(int[] arr, int n){
        if (n < 0) {
            n *=-1;
            for (int i = 0; i < n; i++) {
                int temp = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = temp;
            }
            return arr;
        }


        if (n > 0){
            for (int i = 0; i < n; i++) {
                int temp = arr[arr.length - 1];
                for(int j = arr.length-2; j >= 0 ; j-- ) {
                    arr[j + 1] = arr[j];
                }
                arr[0] = temp;
            }
        }

        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        int[] minMax = {9, -1, -125, 596, 6, 16, 182};

        fillArr(arr);
        fillWithNumbers();
        fillDiagonalElements();

        System.out.println(findMinElement(minMax));
        System.out.println(findMaxElement(minMax));

        System.out.println(checkBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(checkBalance(new int[]{10,10}));

        System.out.println(Arrays.toString(shiftElements(new int[]{1,2,5,6,-52,-12}, 3)));


    }
}
