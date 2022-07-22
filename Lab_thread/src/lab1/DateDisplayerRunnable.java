package lab1;
import java.lang.Runnable;
import java.util.Date;
public class DateDisplayerRunnable implements Runnable {
	public static void main(String[] args) {
		DateDisplayerRunnable dateDisplayerRunnable=new DateDisplayerRunnable();
		Thread thread=new Thread(dateDisplayerRunnable);
		thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Date date=new Date();
		while(true) {
			System.out.println(date);
			System.out.println(Thread.currentThread().getName());
		}
			
		}


		
	
}
