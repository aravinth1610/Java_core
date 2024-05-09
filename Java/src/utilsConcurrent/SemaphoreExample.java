package utilsConcurrent;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

	public static void main(String[] args) {
		System.out.println("testing .. ");
		Semaphore sem = new Semaphore(1);
		new Thread(new IncThread(sem, "A"));
		new Thread(new DecThead(sem, "B"));
	}
}

class Shared {
	static int count = 0;
}

class IncThread implements Runnable {

	String name;
	Semaphore sem;

	public IncThread(Semaphore s, String n) {
		sem = s;
		name = n;
	}

	@Override
	public void run() {
		System.out.println("String name" + name);
		try {
			System.out.println("wating for permit" + name);
			sem.acquire();
			System.out.println(name + "gets permit");
			for (int i = 0; i < 5; i++)
				Shared.count++;
			System.out.println(name + ": " + Shared.count);
			Thread.sleep(10);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name+" release the permit");
		sem.release();

	}

}


class DecThead implements Runnable{

	String name; 
	Semaphore sem; 
	public DecThead(Semaphore s , String n){
		name = n; 
		sem=s;
	}
	
	@Override
	public void run() {
		System.out.println("starting"+name);
		try {
			
			System.out.println(name+"is wating for permit");
			sem.acquire();
			System.out.println(name+"gets a permit");
			
			for(int i =0 ; i< 5 ;i++)
				Shared.count--; 
			
			System.out.println(name+": "+Shared.count);
			Thread.sleep(10);
			
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(name + " release the permit");
		sem.release();
		
	}
	
}