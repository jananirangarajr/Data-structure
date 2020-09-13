import java.util.Scanner;

class MaxProduct {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int array[] = new int[n];

		for (int i = 0 ; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println(getMaxProduct(array,n));
	}

	private static int getMaxProduct(int[] arr, int n) {
		int max1 = arr[0];
        int max2 = arr[1];
        for (int i = 2; i < n; i++) {
            if (max1 < arr[i] ) {
                if (max2 < max1) {
                    max2 = max1;
                }
                max1 = arr[i];
            }
            else if(max2 < arr[i]) {
                max2 = arr[i];
            }
        }
        return max1*max2;
	}
}