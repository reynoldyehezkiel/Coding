package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // void artinya hampa

        System.out.println(simpel());

        fungsiVoid("apa pun");
        selamatPagi("emak");
        selamatPagi("abah");
    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }

    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    private static float simpel(){
        return 10.0f;
    }
}
