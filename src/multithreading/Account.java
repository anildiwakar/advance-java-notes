package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	public int balence = 1000;
	//synchronized method
	/*public synchronized void withdraw(int amount)
	{
		  balence = balence - amount;
	}*/
	//synchronized block
	/*public void withdraw(int amount)
	{
		synchronized(this) {
		  balence = balence - amount;
		}
	}*/
	Lock lock=new ReentrantLock();
	public void withdraw(int amount)
	{
		try {
		  lock.lock();
		  balence = balence - amount;
		} finally {
		  lock.unlock();
		}
	}

}
