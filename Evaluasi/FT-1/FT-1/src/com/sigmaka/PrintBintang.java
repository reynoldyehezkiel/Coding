package com.sigmaka;

import java.util.Scanner;

public class PrintBintang {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input n = ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i + j == n - 1){
                    System.out.print("_ ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.print("\n");
        }

    }


}
