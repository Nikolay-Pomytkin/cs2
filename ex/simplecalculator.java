import java.util.*;
import java.lang.*;
import java.io.*;
class SimpleCalc
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int first = scan.nextInt();
		System.out.println("Enter your second number: ");
		int second = scan.nextInt();
		System.out.println("Enter the operation you would like to apply: ");
		String operation = scan.next();
		double result = 0;
		if(operation.equals("*")){
			result = first * second;
		} else if (operation.equals("/")){
			result = first / second;
		} else if (operation.equals("+")){
			result = first + second;
		} else if (operation.equals("-")){
			result = first - second;
		} else if (operation.equals("%")){
			result = first % second;
		}
		System.out.println("The answer is: " + result);
	}
}
