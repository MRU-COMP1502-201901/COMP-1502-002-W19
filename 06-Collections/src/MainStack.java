import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class MainStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		List<Integer> list = stack;
		Collection<Integer> collection = list;

		System.out.println("Let's do stack things");
		System.out.println(stack);
		System.out.println("Push 1");
		stack.push(1);
		System.out.println(stack);
		System.out.println("Peek");
		System.out.println(stack.peek());
		System.out.println("Push 2");
		stack.push(2);
		System.out.println(stack);
		System.out.println("Peek");
		System.out.println(stack.peek());
		System.out.println("Pop");
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Empty");
		System.out.println(stack.empty());
		System.out.println("Pop");
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println("Empty");
		System.out.println(stack.empty());
	}

}
