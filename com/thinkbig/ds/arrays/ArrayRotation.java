
package thinkbig.psds;
import java.util.Scanner;

class ArrayRotation {

public static void main (String args[]) {
	
	Scanner scanner = new Scanner(System.in);
	int n = scanner.nextInt();
	int[] array = new int[n];

	for (int i = 0; i < n; i++) {
		array[i] = scanner.nextInt();
	}
	int noOfRotation = scanner.nextInt();

	rotate(array,noOfRotation );
	for (int i = 0; i < n; i++) {
		System.out.println(array[i]+" ");
	}
}

private static void rotate(int[] array, int r) {

	if (r == 0) {
		return;
	}
	else {
		r = r - 1;
		int firstElement = array[0];
		
		for (int i = 0; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] = firstElement;
		rotate(array,r);
	}
    }
}