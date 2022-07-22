package Lab1;

public class ReturnLambdaExpresstion {
	public static void main(String[] args) {
		Addable ad1= (a,b)->{
			return a+b;
		};
		System.out.println("Add");
		System.out.println(ad1.add(10,20));
		
		Addable1 ad2= (a,b)->{
			return a-b;
		};
		System.out.println("Subtract");
		System.out.println(ad2.sub(40, 20));
		
		Addable2 ad3= (a,b)->{
			return a*b;
		};
		System.out.println("Multiply");
		System.out.println(ad3.mul(40, 20));
		
		Addable3 ad4= (a,b)->{
			return a/b;
		};
		System.out.println("Division");
		System.out.println(ad4.div(40, 20));
	}

}
