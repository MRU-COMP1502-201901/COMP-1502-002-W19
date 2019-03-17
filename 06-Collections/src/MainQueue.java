import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {

	public static void main(String[] args) {
		LinkedList<Integer> linkedlist = new LinkedList<Integer>();
		Queue<Integer> queue = linkedlist;
		Collection<Integer> collection = queue;

		System.out.println("Are these pointers to the same set");
		System.out.println(linkedlist == queue && linkedlist == collection);

		System.out.println("Let's do queue things");
		System.out.println(queue);
		System.out.println("Offer 1");
		queue.offer(1);
		System.out.println(queue);
		System.out.println("Peek");
		System.out.println(queue.peek());
		System.out.println("Offer 2");
		queue.offer(2);
		System.out.println(queue);
		System.out.println("Peek");
		System.out.println(queue.peek());
		System.out.println("Poll");
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println("Poll");
		System.out.println(queue.poll());
		System.out.println(queue);
	}

}
