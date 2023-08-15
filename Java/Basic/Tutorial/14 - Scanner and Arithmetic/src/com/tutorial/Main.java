package com.tutorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("MENGHITUNG LUAS");
        System.out.print("Panjang\t: ");
        panjang = userInput.nextInt();
        System.out.print("Lebar\t: ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("Tinggi\t: ");
        tinggi = userInput.nextInt();

        volume = luas * tinggi;
        System.out.println("Volume = " + volume);
    }
}
