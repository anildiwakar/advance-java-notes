package multithreading;

public class Account {
	public int balence = 1000;
	public void withdraw(int amount)
	{
		synchronized(this) {
		  balence = balence - amount;
		}
	}

}
