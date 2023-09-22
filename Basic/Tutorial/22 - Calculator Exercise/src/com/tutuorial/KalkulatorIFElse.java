package com.tutuorial;

import java.util.Scanner;

public class KalkulatorIFElse {

    public static void main(String[] args) {

        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a\t\t: ");
        a = inputUser.nextFloat();
        System.out.print("operator\t: ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b\t\t: ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        if (operator == '+') {
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-') {
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*') {
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/') {
            if (b == 0) {
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("Operator " + operator + " tidak ditemukan");
        }
    }
}
