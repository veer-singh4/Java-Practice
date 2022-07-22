package sa.uncheckedexeption;

public class UncheckedLab {
	public static void main(String[] args) {
		int num1=10;
		int num2=0;
		try {
		double d=(double)(num1/num2);
		System.out.println(d);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
