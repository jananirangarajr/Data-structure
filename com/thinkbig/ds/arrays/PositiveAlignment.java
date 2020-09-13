import java.util.Scanner;
import java.util.ArrayList;
class PositiveAlignment {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		int testCase = scanner.nextInt();
		while(testCase-- > 0) {
		int n = scanner.nextInt();
		int[] array = new int[n];

		int positiveIndex = 0;
		int negativeIndex = 1;
		
		for (int i = 0; i < n ; i++) {
			int data = scanner.nextInt();
			if (data > 0) {
				array[positiveIndex] = data;
				positiveIndex +=2;
			}
			else {
				array[negativeIndex] = data;
				negativeIndex +=2;
				
			}
		}
		for (int i = 0 ; i < n ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		}
	}
}