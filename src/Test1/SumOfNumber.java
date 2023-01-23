package Test1;

import java.util.Scanner;

public class SumOfNumber {
	
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
		int sum = 0;
		int m,n;
		
		System.out.print("Enter Initial Number :");
		m = input.nextInt();
		
		System.out.print("Enter Final Number :");
		n = input.nextInt();
		
		for  (int i= m; i<= n; i++) {
			if(i%2==0) {
			sum = sum + i;
			System.out.print(" "+i);
			}
		}
		System.out.println();
		System.out.println("The Sum is ="+sum);	
	}
}








