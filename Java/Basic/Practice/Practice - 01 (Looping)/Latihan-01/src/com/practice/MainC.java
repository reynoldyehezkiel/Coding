package com.practice;

import java.util.Scanner;

public class MainC {

    public static void main(String[] args) {

        int n;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Input n: ");
        n = userInput.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j ++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
