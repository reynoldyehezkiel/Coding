package com.tutorial;

import java.util.Scanner;

public class LoopingDoWhile {

    public static void main(String[] args) {

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("masukan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("masukan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        do {
            total = total + nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;
        }while(nilaiAwal <= nilaiAkhir);

    }
}
