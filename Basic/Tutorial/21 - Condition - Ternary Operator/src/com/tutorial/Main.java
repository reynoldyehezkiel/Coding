package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input, x;

        Scanner inputUser = new Scanner(System.in);

        System.out.print("masukan nilai: ");
        input = inputUser.nextInt();

        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("hasilnya " + x);
    }
}
