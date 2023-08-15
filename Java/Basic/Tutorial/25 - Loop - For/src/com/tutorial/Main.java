package com.tutorial;

public class Main {

    public static void main(String[] args) {
        System.out.println("loop pertama");

        for (int nilai = 0; nilai <= 10; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        System.out.println("loop kedua");

        for (int nilai = 0; nilai < 10; nilai++){

            System.out.println("for loop ke-" + nilai);

        }

        for (int nilai = 10; nilai > 0; nilai--){

            System.out.println("for loop ke-" + nilai);
        }

    }
}
