
                  // 13 January 2023
                  //Even/Odd

package Test1;
import java.util.Scanner;

public class Class8 {
	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		int num;
		System.out.print("Enter any positive number :");
		num = input.nextInt();
		
		if(num%2==0) {
			System.out.print("ODD");
		}
		else {
			System.out.print("EVEN");
		}
	}

}
