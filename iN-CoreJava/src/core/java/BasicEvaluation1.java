package core.java;

public class BasicEvaluation1 {

	public static void main(String[] args) {
		int a = 25;
		int b = 2;
		int c = a/b;
		System.out.println(-b++);
		System.out.println(c);
		float f = a/b;
		System.out.println(f);//truncation or rounding to 0
		
		int a1 = 0;
		int a2 = 0;
//		System.out.println(a1/a2); //exception
		double d1 = 0d;
		double d2 = 0d;
		double d = d1/d2;
//		System.out.println(d);
//		System.out.println(NaN);//error
		
		byte ten = 10;
		byte twenty = 20;
		byte eval = (byte)(ten*twenty);//byte overflow. //-56
		System.out.println(eval);
		
		
	}

}
