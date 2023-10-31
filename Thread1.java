package threads;

public class Thread1 extends Thread{
	@Override
	public void run() { //its a method to override
		try {
			System.out.println("Thread1 is running");
		} catch (Exception e){
			//throwing exception
			System.out.println("Exception raised" + e);
		}
	}
}
