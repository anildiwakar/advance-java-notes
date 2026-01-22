package Queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeueEx {

	public static void main(String[] args) {
		ArrayDeque<String> processes = new ArrayDeque<>();
		processes.addFirst(null);
		processes.addLast(null);
		processes.offerFirst(null);
		processes.offerLast(null);
		processes.removeFirst();
		processes.removeLast();
		processes.pollFirst();
		processes.pollLast();
		processes.peekFirst();
		processes.peekLast();

		

	}

}
