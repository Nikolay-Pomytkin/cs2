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
			System.out.println("The julian date for today is: " + DateConvert(cdays, cmonth, cyear));	
		} else if (question == 2) {
			System.out.println("Enter the julian date: (YYYYDDD)");
			int juliandate = scan.nextInt();
			System.out.println("The normal date for today is : " + DateFromJulian(juliandate));
		} else if (question == 3){
			System.out.println("Enter the first date:");
			int firstdate = scan.nextInt();
			System.out.println("Enter the second date:");
			int seconddate = scan.nextInt();
			System.out.println("There are " + daysinbetween(firstdate, seconddate) + " days in between "+ seconddate + " and " + firstdate);
		}

	}
	public static int DateConvert(int day, int month, int year){
		int [] daysinmonth = {31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
		int days=daysinmonth[month-1] + day;
		String z=year + "" + days;
		int f = Integer.parseInt(z);
		return f;
	}
	public static int DateFromJulian (int date){
		int f = 0;
		return f;
	}
	public static int daysinbetween(int fdate, int sdate){
		int f = 0;
		
		return f;
	}
}
