                 
                     // Logical (AND)
package Test1;

import java.util.Scanner;

public class Class11 {
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		char ch;
		System.out.print("Enter Any Letter : ");
		
		ch = input.next().charAt(0);
		
		if(ch>='a' && ch<='z') {
			System.out.print("Small Letter");
			
		}
		else if (ch>='A' && ch<='Z') {
			System.out.print("Capital Letter");
			
		}
		else {
			System.out.print("Not a Leter");
			
			
		}
	}
}
