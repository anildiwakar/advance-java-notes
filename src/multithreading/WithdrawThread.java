package multithreading;

public class WithdrawThread extends Thread{
	public Account acc;
	public WithdrawThread(Account account)
	{
		this.acc=account;
	}
	
	public void run()
	{
		this.acc.withdraw(100);
	}

}
