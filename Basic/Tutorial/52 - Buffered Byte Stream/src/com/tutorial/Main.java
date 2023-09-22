package com.tutorial;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        long waktuStart, waktuFinish;

        // Membaca dari File
        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println(byteInput.available());

        // Menghitung waktu pembacaan
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();


        // Membaca dari memory
        FileInputStream byteInput2 = new FileInputStream("input.txt");
        BufferedInputStream bufferedInput = new BufferedInputStream(byteInput2);

        // Menghitung waktu pembacaan
        bufferedInput.mark(200);
        waktuStart = System.nanoTime();
        System.out.println(bufferedInput.readAllBytes());
        waktuFinish = System.nanoTime();
        System.out.println("waktu = " + (waktuFinish - waktuStart));
        byteInput.close();

        // baca ulang
        bufferedInput.reset();
        byte[] data = bufferedInput.readAllBytes();
        String dataString = new String(data);
        System.out.println(dataString);
        byteInput2.close();
        bufferedInput.close();

        // Menulis dengan buffered output
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(byteOutput);

        bufferedOutput.write(data,0,data.length);
        bufferedOutput.flush();

        bufferedOutput.close();
        byteOutput.close();

    }
}
