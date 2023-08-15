package com.sigmaka;

public class EatChocolate {

    public static void main(String[] args) {
        int testCase = 3;
        int money, price, wrapperExchange;

        String input = "6,2,2";
        String[] multiInput = input.split(",");

        money = Integer.parseInt(multiInput[0]);
        price = Integer.parseInt(multiInput[1]);
        wrapperExchange = Integer.parseInt(multiInput[2]);

        System.out.println(eatChocolate(money, price, wrapperExchange));
    }

    private static int eatChocolate(int n, int c, int m){
        int countEat = 0;
        int bars, wrappers, eat = 0;

        // beli coklat
        bars = n/c;

        // dapat bungkus
        wrappers = bars;

        // makan coklat
        eat = bars;

        // tukar bungkus sampai tidak bisa ditukar
        while (wrappers >= m) {

            // tukar bungkus menjadi coklat
            bars = wrappers / m;

            // sisa bungkus
            wrappers = wrappers - bars;

            // makan coklat
            eat = eat + bars;
        }

        return eat;
    }
}
