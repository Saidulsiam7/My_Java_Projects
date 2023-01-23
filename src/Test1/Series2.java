package Test1;

import java.util.Scanner;

public class Series2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    int n, result = 1;
		
		System.out.print("Enter Last Number :");
		n = input.nextInt();
		
		for(int i = 1; i<=n; i++) {
			result = result * i*i;
		System.out.print(i+"x"+i+" ");	
			
		}
		System.out.println();
		System.out.print(result);
	}

}
