package com.tutorial;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arrayAngka1 = {1,2,3,4,5};

        // merubah array menjadi string
        System.out.println("=============================\nMerubah array menjadi string");
        printArray(arrayAngka1);
        System.out.println("=============================\n\n");


        // mengcopy array
        System.out.println("=============================\nMengcopy array");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);

        System.out.println("\n- Mengcopy dengan loop");
        for (int i = 0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);

        System.out.println("\n- Mengcopy dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);

        System.out.println("\n- Mengcopy dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        System.out.println("=============================\n\n");


        // fill array
        System.out.println("=============================\nFill array");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5,5);
        printArray(arrayAngka5);
        System.out.println("=============================\n\n");


        // Komparasi array
        System.out.println("=============================\nKomparasi array");
        int[] arrayAngka6 = {1,2,3,4,9};
        int[] arrayAngka7 = {1,2,3,4,5};
        printArray(arrayAngka6);
        printArray(arrayAngka7);

        System.out.println("\n- Membandingkan antara dua buah array");
        System.out.println(Arrays.equals(arrayAngka6,arrayAngka7));

        if (Arrays.equals(arrayAngka6,arrayAngka7)) {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini beda");
        }

        System.out.println("\n- Mengecek array mana yang lebih besar");
        System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));

        System.out.println("\n- Mengecek index mana yang berbeda");
        System.out.println(Arrays.mismatch(arrayAngka6, arrayAngka7));
        System.out.println("=============================\n\n");


        // Sort array
        System.out.println("=============================\nSort array");
        int[] arrayAngka8 = {1,6,4,5,3,2,6};
        printArray(arrayAngka8);
        Arrays.sort(arrayAngka8);
        printArray(arrayAngka8);
        System.out.println("=============================\n\n");


        // Search array
        System.out.println("=============================\nSearch array");
        int angka = 3;
        int posisi = Arrays.binarySearch(arrayAngka8,angka);
        System.out.println("angka = " + angka + " ada di index " + posisi);
        System.out.println("=============================");
    }

    private static void printArray(int[] dataArray){
        System.out.println("array = " + Arrays.toString(dataArray));
    }
}
