package multithreading;

public class RaceConditionDemo {

	public static void main(String[] args) throws InterruptedException {
		Account account =new Account();
		Thread t1=new WithdrawThread(account);
		Thread t2=new WithdrawThread(account);
		Thread t3=new WithdrawThread(account);
		Thread t4=new WithdrawThread(account);
		Thread t5=new WithdrawThread(account);
		Thread t6=new WithdrawThread(account);
		Thread t7=new WithdrawThread(account);
		Thread t8=new WithdrawThread(account);
		Thread t9=new WithdrawThread(account);
		Thread t10=new WithdrawThread(account);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		t6.join();
		t7.join();
		t8.join();
		t9.join();
		t10.join();


		
		System.out.println(account.balence);





		
	}

}
