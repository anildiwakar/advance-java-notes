package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		Queue<String> processes = new PriorityQueue<>();
		processes.add("Java");  // it will add element into the queue, if queue is full this throws exception
		processes.offer("Python"); // it will add element into the queue, if queue is full it will return false
		processes.add("C");
		processes.add("JavaScript");
		processes.add("TypeScript");
		System.out.println(processes.remove());
		System.out.println(processes.poll());
		System.out.println(processes.element());
		System.out.println(processes.peek());

		

	
	}

}
