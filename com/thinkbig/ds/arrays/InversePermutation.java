package thinkbig.psds;

import java.util.Scanner;
import java.util.*;
class InversePermutation {
public static void main(String[] args) {
	
	int array[] = {1,4,3,2};//{2,3,4,5,1};

	int[] copyArray = new int[array.length];

	inverse(array,0,copyArray);
	for (int i = 0; i < array.length; i++) {
		System.out.println(copyArray[i]);
	}
}

private static void inverse(int[] array,int i,int[] copyArray) {

	if(i>array.length-1) {
		//int element = array[i];
		//copyArray[element] = i;
		return;
	}
	else {
		inverse(array,i+1,copyArray);
		//System.out.print(i+" "+Arrays.asList(copyArray)+" ");
		int element = array[i];
		//System.out.println(element+" ");
		copyArray[element-1] = i+1;
	}
}
}