package lab1;
import java.util.Date;

public class DateDisplayer {

	public static void main(String[] args) {
		Date date=new Date();
		while(true) {
			System.out.println(date);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			System.out.println(Thread.currentThread());
		}
		

	}

}
