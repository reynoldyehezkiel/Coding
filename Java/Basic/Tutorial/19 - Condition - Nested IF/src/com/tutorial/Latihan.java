package com.tutorial;

import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {

        int a,b,c;

        Scanner userInput = new Scanner(System.in);
        System.out.print("a\t: ");
        a = userInput.nextInt();
        System.out.print("b\t: ");
        b = userInput.nextInt();
        System.out.print("c\t: ");
        c = userInput.nextInt();

        if (a == 5) {

            System.out.println("statement 1");

        } else {

            if (b == 10) {

                System.out.println("statement 4");

            } else {

                if (c == 15) {

                    System.out.println("statement 2");

                } else {

                    System.out.println("statement 3");

                }

            }

        }
    }
}
