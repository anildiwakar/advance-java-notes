package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	/*	Runnable r=()->{
			for(int i=0;i<100;i++)
			{
				System.out.println(i);
			}
		};  */
		
		Callable r=()->{
			int sum=0;
			for(int i=1;i<=100;i++)
			{
				sum = sum+i;
			}
			return sum;
		};
		//ExecutorService es = Executors.newSingleThreadExecutor(); // single thread
		ExecutorService es1 = Executors.newFixedThreadPool(5); // Fixed thread pool of size 5

		Future<Integer> task1 = es1.submit(r);
		System.out.println(task1.cancel(true));
		System.out.println(task1.isCancelled());

		Future<Integer> task2 = es1.submit(r);
		Future<Integer> task3 = es1.submit(r);
		Future<Integer> task4 = es1.submit(r);
		Future<Integer> task5 = es1.submit(r);
		
		
		//System.out.println(task1.get());
		System.out.println(task1.isDone());
		System.out.println(task2.get());
		System.out.println(task3.get());
		System.out.println(task4.get());
		System.out.println(task5.get());

		
		//es.shutdown(); // currently executing tasks will run and it wont take new tasks
		//es.shutdownNow(); // it wont bother about currently executing task it will shutdown immediatly
		
	}

}
