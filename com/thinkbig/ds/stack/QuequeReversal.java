import java.util.Scanner;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

class QueueReversal {

	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList();

		queue.add(1);
		queue.add(2);
		queue.add(3);

		Stack<Integer> stack = new Stack<Integer>();

		while (queue.size() > 0) {

			stack.add(queue.remove());
		}

		queue.clear();

		while (stack.size() > 0) {
			queue.add(stack.pop());
		} 

		Iterator iterator = queue.iterator();

		while (iterator.hasNext()) {
			System.out.println((int)iterator.next());
		}
	}
}