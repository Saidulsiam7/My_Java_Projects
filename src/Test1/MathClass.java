
                 // 19 January 2023


package Test1;

public class MathClass {
	
	public static void main(String[] args) {
		
		int X = 2;
		int Y = 3;
		
		int Max = Math.max(X, Y);
		System.out.println("Maximum Value ="+Max);
		
		int Min = Math.min(X, Y);
		System.out.println("Minimum Value ="+Min);
		
		int Absolute = Math.abs(Y);
		System.out.println("Absolute Value ="+Absolute);
		
		double Power = Math.pow(X, Y);
		System.out.println("X to the Power Y ="+Power);
		
		int Round = Math.round(8.9f);
		System.out.println("Round of 8.9 ="+Round);
		
		double PI = Math.PI;
		System.out.print("PI ="+PI);
	}

}
