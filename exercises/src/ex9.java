import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner scan  = new Scanner (System.in);
		System.out.println("Type 1 to convert normal date into julian date:");
		System.out.println("Type 2 to convert julian date into normal date:");
		System.out.println("Type 3 to days in between two dates:");
		int question = scan.nextInt();
		if (question == 1){
			System.out.println("Enter the current year: (YYYY)");
			int cyear = scan.nextInt();
			System.out.println("Enter the current month: (MM)");
			int cmonth = scan.nextInt();
			System.out.println("Enter the current days: (DD)");
			int cdays = scan.nextInt();
			int juliandate = DateConvert(cdays, cmonth, cyear);
			System.out.println("The julian date for today is: " + juliandate);	
		} else if (question == 2) {
			System.out.println("Enter the julian date: (YYYYDDD)");
			
		} else if (question == 3){
			
		}

	}
	public static int DateConvert(int day, int month, int year){
		int [] daysinmonth = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		int days=daysinmonth[month-1] + day;
		String z=year + "" + days;
		int f = Integer.parseInt(z);
		return f;
	}
	public static int DateFromJulian (int year, int days){
		int f = 0;
		return f;
	}
}
