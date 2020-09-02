import java.util.Scanner;

class DeleteNode {

	static Node head;

	static class Node {
		int data;
		Node next;
		Node (int element) {
			this.data = element;
			this.next = null;
		}
	}

	private static void deleteAlternate() {
		Node temp = head;
		int count = 1;

		while (temp != null) {
			if ((count+1)%2 == 0) {
				if (temp.next != null) {
					temp.next = temp.next.next;
				}
				count--;
			}
			count++;
			temp = temp.next;
		}
	}

	private static void print() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int firstElement = scanner.nextInt();
		Node node = new Node(firstElement);
		head = node;
		while ( n-- > 1) {
			int data = scanner.nextInt();
			Node temp = new Node(data);
			node.next = temp;
			node = temp;
		}
		deleteAlternate();
		print();

	}
}