
                 // 13 January 2023
                 // else if


package Test1;
import java.util.Scanner;

public class Class7 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		
		System.out.print("Enter Integer Number :");
		num = input.nextInt();
		
		if (num>0) {
			System.out.println("Positive");
		}
		else if(num<0) {
			System.out.println("Negative");
		}
		
		
		else {
			System.out.println("Equal to Equal");
		}
		
	}

}
