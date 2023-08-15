package com.tutorial;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array2D = {
                {1,2},
                {3,4}
        };
        printArray2D(array2D);

        int[][] arrayAngka = new int[5][4];
        printArray2D(arrayAngka);

        // looping manual
//        for (int i = 0; i < arrayAngka.length; i++){
//            for (int j = 0; j < arrayAngka[i].length; j++){
//                System.out.print(arrayAngka[i][j]+",");
//            }
//        }

        // looping foreach
//        for (int[] baris: arrayAngka) {
//            for (int angka: baris) {
//                System.out.println(angka + ",");
//            }
//        }

    }

    private static void printArray2D(int[][] dataArray){
        for (int[] baris: dataArray) {
            for (int angka: baris) {
                System.out.print(angka + ", ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
