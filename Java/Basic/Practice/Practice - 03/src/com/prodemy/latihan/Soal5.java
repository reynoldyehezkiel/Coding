package com.prodemy.latihan;

import com.prodemy.util.ArrayUtil;
import com.prodemy.util.FiboUtil;

public class Soal5 {
	static int[] fibo;
	
	public static void main(String[] args) {
		int panjangKarakter = 4;
		int n = 9;
		fibo = FiboUtil.createFibo(n);
		
		// Soal A
		for (int kolom=0; kolom<n; kolom++) {
			System.out.printf("%4s", fibo[kolom]);
		}
		System.out.println("\n\n");

		// Soal B
		for (int baris=0; baris<n; baris++) {
			for (int kolom=0; kolom<n; kolom++) {
				System.out.printf("%4s", fibo[kolom]);
			}
			System.out.println();
		}
		System.out.println("\n\n");

		// Soal C
		int pengurang=0;
		int tengah = n/2+1;
		int[][] display = new int[n][n];
		
		// Mengisi array display dengan bilangan fibonaci
		for (int baris=0; baris<n; baris++) {
			for (int kolom=0; kolom<n; kolom++) {
				display[baris][kolom] = fibo[kolom];
			}
		}
		
		pengurang=0;
		tengah = n/2+1;
		for (int baris=0; baris<n; baris++) {
			for (int kolom=0; kolom<n; kolom++) {
				if (baris%2!=0) {
					if (kolom>=pengurang && kolom<n-pengurang) {
						display[baris][kolom] = -1;
					}
				}
			}
			if (baris<tengah-1) pengurang++;
			else pengurang--;
		}

		pengurang=0;
		tengah = n/2+1;
		for (int baris=0; baris<n; baris++) {
			for (int kolom=0; kolom<n; kolom++) {
				if (kolom%2!=0) {
					if (baris>=pengurang && baris<n-pengurang) {
						display[baris][kolom] = -1;
					}
				}
				if (kolom<tengah-1) pengurang++;
				else pengurang--;
			}
			pengurang=0;
		}

		ArrayUtil.displayArray(display, panjangKarakter);
	}

}
