package com.tutorial;

import java.util.Scanner;

public class MainFunction {

    public static String PrintSomething(String text, int length) {
        String result;
        int remainLength;

        if (text.length() >= length) {
            result = text.substring(0, length);
        } else {
            remainLength = length - text.length();
            result = "_".repeat(remainLength) + text;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        String result;

        System.out.print("Input kata: ");
        String inputText = userInput.nextLine();

        System.out.print("Input panjang:  ");
        int inputLength = userInput.nextInt();

        result = PrintSomething(inputText, inputLength);
        System.out.printf("Output = %s", result);
    }
}