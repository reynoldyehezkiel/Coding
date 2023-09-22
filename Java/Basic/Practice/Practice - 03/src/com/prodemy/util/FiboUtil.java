/**
 * 
 */
package com.prodemy.util;

/**
 * @author Awiyanto Ajisasongko
 *
 * Aug 26, 2023
 */
public class FiboUtil {
	
	/**
	 * Generate fibonacci sejumlah n bilangan
	 * @param n jumlah angka fibonacci
	 * @return
	 */
	public static int[] createFibo(int n) {
		int[] result = new int[n];
		result[0] = 1;
		result[1] = 1;
		for (int i=2; i<n; i++) {
			result[i] = result[i-2] + result[i-1];
		}
		return result;
	}
}
