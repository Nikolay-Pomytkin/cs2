import java.util.Scanner;

public class Labs2 {
	// Nikolay Pomytkin
	// Lab #2
	// September 30 2015
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 character:");
		char c1 = scan.next().charAt(0);
		System.out.println("Enter another character:");
		char c2 = scan.next().charAt(0);
		System.out.println("Enter another character:");		
		char c3 = scan.next().charAt(0);
		System.out.println("Enter another character:");
		char c4 = scan.next().charAt(0);
		System.out.println("Enter another character:");
		char c5 = scan.next().charAt(0);
		scan.close();
		int total = c1 + c2 + c3 + c4 + c5;
		System.out.println(c1 + " "+ c2 + " " + c3 + " "+ c4 + " "+ c5 + " has a value of " + total);
		System.out.println(c5 + " has an ASCII value of " + (int) c5);

	}

}
