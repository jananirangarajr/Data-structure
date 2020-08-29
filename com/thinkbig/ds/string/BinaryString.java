import java.util.Scanner;
class BinaryString {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		int count = 0;

		for (int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == '1') {
				count++;
			}
		}
		int n = count - 1;
		System.out.println((n*(n+1))/2);
	}
}