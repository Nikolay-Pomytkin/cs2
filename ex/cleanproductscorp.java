import java.util.*;
import java.lang.*;
import java.io.*;
class CleanProductsCorp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		final double wax = 13.95;
		final double soap = 17.95;
		final double windowCleaner = 29.95;
		System.out.println("CPC (Clean Products Corporation): Gross pay calculator");
		System.out.println("Enter your position (S/R), followed by number of products sold (W/S/C):");
		Scanner scan = new Scanner(System.in);
		String stats = scan.nextLine();
		String[] statsA;
		statsA = new String[4];
		statsA = stats.split(" ", 4);
		double totalsales = (Integer.parseInt(statsA[1]) * wax) + (Integer.parseInt(statsA[2]) * soap) + (Integer.parseInt(statsA[3]) * windowCleaner);
		double commision, bonus, grossPay;
		if(statsA[0].equals("S")){
			System.out.println("Sales from wax: $" + (Integer.parseInt(statsA[1]) * wax));
			System.out.println("Sales from soap: $" + (Integer.parseInt(statsA[2]) * soap));
			System.out.println("Sales from window cleaner: $" + (Integer.parseInt(statsA[3]) * windowCleaner));
			System.out.println("Total sales: $" + totalsales);
			commision = totalsales * 0.07;
			System.out.println("Commision: $" + commision);
			if(commision >=300){
				bonus = 100;
				System.out.println("Bonus: $" + bonus);
			} else {
				bonus = 0;
				System.out.println("Bonus: $0.00");
			}
			grossPay = commision + bonus;
			System.out.println("Gross pay: $" + grossPay);
		} else if(statsA[0].equals("R")){
			System.out.println("Sales from wax: $" + (Integer.parseInt(statsA[1]) * wax));
			System.out.println("Sales from soap: $" + (Integer.parseInt(statsA[2]) * soap));
			System.out.println("Sales from window cleaner: $" + (Integer.parseInt(statsA[3]) * windowCleaner));
			System.out.println("Total sales: $" + totalsales);
			commision = totalsales * 0.07;
			System.out.println("Commision: $" + commision);
			if(commision >=200){
				bonus = 100;
				System.out.println("Bonus: $" + bonus);
			} else {
				bonus = 0;
				System.out.println("Bonus: $0.00");
			}
			grossPay = commision + bonus;
			System.out.println("Gross pay: $" + grossPay);
		} else {
			System.out.println("Fatal Error: Incorrect input.");
		}
	}
}
