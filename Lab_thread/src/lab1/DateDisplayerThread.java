package lab1;
import java.lang.Thread;
import java.util.Date;
public class DateDisplayerThread extends Thread{

	public static void main(String[] args) {
		DateDisplayerThread thread= new DateDisplayerThread();
		thread.start();
	}
	
	

	public void run() {
		Date date=new Date();
		while(true) {
			System.out.println(date);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println(getName());
		}

	}

}
