package multithreading;

public class multithreading {

	public static void main(String[] args) throws InterruptedException {
		Runnable r=()->{
			for(int i=1;i<=100;i++)
			{
				System.out.println(i);
			}
		};
		Runnable r2=()->{
			for(int i=100;i>=1;i--)
			{
				System.out.println(i);
			}
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r2);
		t1.start();
		System.out.println(t1.getState());
		t2.start();
		
		t1.sleep(1000);
		System.out.println(t1.getState());

		

	}

}
