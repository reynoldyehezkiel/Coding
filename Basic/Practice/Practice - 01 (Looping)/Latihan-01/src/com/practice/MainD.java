package com.practice;

import java.util.Scanner;

public class MainD {

    public static void main(String[] args) {

        int n;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input n: ");
        n = userInput.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(j + (j + 1));
                } else if ((i + j) == n - 1) {
                    System.out.print(j + (j + 1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
