package com.tutorial;

import java.util.Scanner;

public class MainFunctionVoid {

    public static void PrintSomething(String text, int length) {
        int remainLength;

        if (text.length() >= length) {
            System.out.println(text.substring(0, length));
        } else {
            remainLength = length - text.length();
            for (int i = 0; i < remainLength; i++){
                System.out.print("_");
            }
            System.out.println(text);
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Input kata: ");
        String inputText = userInput.nextLine();

        System.out.print("Input panjang:  ");
        int inputLength = userInput.nextInt();

        System.out.print("Output = ");
        PrintSomething(inputText, inputLength);
    }
}