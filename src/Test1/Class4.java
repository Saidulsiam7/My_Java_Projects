                  //11 January 2023
               //Arithmetic Operator
package Test1;
import java.util.Scanner;

public class Class4 {
	
	public static void main(String[] args) {
		
		Scanner Math  = new Scanner(System.in);
		
		int Num1,Num2,Result;
		
		System.out.print("Enter Your First Number :");
		Num1 = Math.nextInt();
		
		System.out.print("Enter Your Second  Number :");
		Num2 = Math.nextInt();
		
		Result = Num1+Num2;
    	System.out.println("Plus :"+Result);
	
	    Result = Num1-Num2;
	    System.out.println("Minus :"+Result);
	    
	    double Result2 =(double) Num1/Num2;
	    System.out.println("Divided :"+Result2);
	    
	    Result = Num1%Num2;
	    System.out.print("Modulus :"+Result);
	
	}
	                
}
