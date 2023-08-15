package com.tutuorial;

import java.util.Scanner;

public class KalkulatorSwitchCase {

    public static void main(String[] args) {

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a\t\t: ");
        a = inputUser.nextFloat();
        System.out.print("operator\t: ");
        operator = inputUser.next();
        System.out.print("nilai b\t\t: ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("pembagi nol menghasilkan tak hingga");
                } else {
                    hasil = a / b;
                    System.out.println("hasil = " + hasil);
                }
                break;
            default:
                System.out.println("Operator " + operator + " tidak ditemukan");
        }
    }
}
