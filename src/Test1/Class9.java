
                 // 14 January 2023
                 // Vowel,Consonant

package Test1;
import java.util.Scanner;

public class Class9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char ch;
		System.out.print("Enter Any Letter :");
		
		ch = input.next().charAt(0);
		
		if(ch == 'a') {
			System.out.println("Vowel");
			}
		else if(ch == 'e') {
			System.out.println("Vowel");
		}
		else if (ch=='i') {
			System.out.println("Vowel");
		}
		else if(ch=='o') {
			System.out.println("Vowel");
		}
		else if (ch=='u') {
			System.out.println("Vowel");
		}
		
		else {
			System.out.println("Consonant");
		}
		
	}
	

}