package com.likelion.project1.week2.d3;

import java.util.Arrays;

public class TwoDimArrEx {
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
        System.out.println();
    }

    public static void insertValue(int[][] arr, int n){
        for(int i=0;i< arr.length;i++){
            arr[n][i] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        insertValue(arr,1);
        insertValue(arr,1);
        insertValue(arr,1);
        insertValue(arr,1);

        printArray(arr);

//        for(int i=0;i<3;i++){
//            System.out.println(Arrays.toString(arr[i]));
    }

}
