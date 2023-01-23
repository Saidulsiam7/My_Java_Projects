package Test1;
import java.util.Scanner;
public class Series1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n,sum=0;
		
		System.out.print("Enter the last Number :");
		n = input.nextInt();
		
		for(int i = 1; i<=n; i=i+1) {
			System.out.print(i+"X"+i+" ");
			sum = sum+i*i; // Square er jonne 1^2
		}
		System.out.println();	
		System.out.println("Sum="+sum);	
	}

}
