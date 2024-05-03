class Multithreading extends Thread {
	public void run()
	{
		try {
			
			System.out.println(
			    "Thread " + Thread.currentThread().getId()+"\nPriority is :" +Thread.currentThread().getPriority());
		}
		catch (Exception e) {
		
			System.out.println("Exception is caught");
		}
	}
}


public class MULTI {
	public static void main(String[] args)
	{
		int n = 5; 
		for (int i = 0; i < n; i++) {
			Multithreading m	= new Multithreading();
			m.start();
		}
	}
}
