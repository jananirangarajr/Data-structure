package com.thinkbig.ds.arrays;

import java.util.Scanner;
public class BinaryArraySort {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int array[];
		int n,countZero=0,countOne=0;
		n = scanner.nextInt();
		array = new int[n];
		for (int i = 0 ; i < n ; i++) {
			array[i] = scanner.nextInt();
			if (array[i] == 0) countZero++;
			else if(array[i] == 1) countOne++;
			else {
				System.out.println("Invalid Input");
				break;
			}	
		}
		
		for (int i =0 ; i < countZero; i++) {
			array[i] = 0;
			System.out.println(array[i]);
		}
		for( int j = countZero; j < n; j++) {
			array[j] = 1;
			System.out.println(array[j]);
		}
	}

}
