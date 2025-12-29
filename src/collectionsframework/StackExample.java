package collectionsframework;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		//stack.add("C");
		System.out.println(stack.isEmpty());
		
		stack.push("Java"); //to add elements into the stack
		stack.push("python"); //to add elements into the stack

		System.out.println(stack.isEmpty());

		for(String ele:stack)
		{
			System.out.println(ele);
		}
		stack.pop(); // remove element from the top of the stack
		for(String ele:stack)
		{
			System.out.println(ele);
		}
		System.out.println(stack.peek());//return top of the stack without removing

	}

}
