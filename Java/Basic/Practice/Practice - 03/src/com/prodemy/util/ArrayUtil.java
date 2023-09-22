/**
 * 
 */
package com.prodemy.util;

/**
 * @author Awiyanto Ajisasongko
 *
 * Aug 26, 2023
 */
public class ArrayUtil {
	public static void displayArray(int[][] a, int panjangKarakter) {
		for (int baris=0; baris<a[0].length; baris++) {
			for (int kolom=0; kolom<a[baris].length; kolom++) {
				if (a[baris][kolom]>0)
					System.out.printf("%"+panjangKarakter+"s", a[baris][kolom]);
				else
					System.out.printf("%"+panjangKarakter+"s", "");
			}
			System.out.println();
		}
	}
}
