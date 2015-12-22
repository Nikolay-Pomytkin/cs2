package holiday;

import java.util.Scanner;

public class holiday {
  public holiday() {}
	
  static final int daysInMonth[] = {
    31, 28, 31, 30, 31, 30,
    31, 31, 30, 31, 30, 31
  };
  static final int daysToMonth[] = {
    0,  31,  59,  90, 120, 151,
    181, 212, 243, 273, 304, 334
  };
  static final String dayName[] ={
    "Sunday",
    "Monday",
    "Tuesday",
    "Wednesday",
    "Thursday",
    "Friday",
    "Saturday"
  };
  static final int DAY0 = 1;
  static public void main(String[] args) {
    new holiday();
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a year:");
    int year = sc.nextInt();
    if (year < 1900 || year >= 3000) {
      System.out.println("Invalid input.");
      System.exit(1);
    }
    int weekday = DayOfWeek(9, 1, year); 
    int day = (8 - weekday) % 7 + 1;
    System.out.println("Labor Day = September " + day );
	
    // Election Day = first Tuesday after first Monday in November:
    weekday = DayOfWeek(11, 1, year);
    day = (8 - weekday) % 7 + 1;       
    day++;
    System.out.println("Election Day = November " + day );

    // Thanksgiving = fourth Thursday in November:
    weekday = DayOfWeek(11, 1, year);   
    day = (11 - weekday) % 7 + 1;       
    day += 21;        
    System.out.println("Thanksgiving = November " + day );

    // Memorial Day  = last Monday in May:
    weekday = DayOfWeek(5, 31, year);  
    day = 31 - (weekday + 6) % 7;      
    System.out.println("Memorial Day = May " + day );
  }
  static boolean leapYear (int year) {
  //  true, if year is divisible by 4, and ...
    return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
  }
  
  // returns true if month-day-year is a valid date 
  static boolean ValidDate (int month, int day, int year) {
    boolean valid = false;  // First assume the date is invalid.
    int days;

    if (year >= 1900 && year <= 2999 && month >= 1 && month <= 12) {
      // Get the number of days in this month
      days = daysInMonth[month-1]; 
      // If February of a leap year -- increment the number of days in this month:
        if (month == 2 && leapYear(year)) {
          days++;
        }
	if (day >= 1 && day <= days) {
	  valid = true;
        }
    }
    return valid;
  }

   static long DaysSince1900 (int month, int day, int year) {
     long days;

     if (year == 1900)
       days = 0;
     else {
       days = (long)year - (long)1900 * 365
         + (year - 1901) / 4       
	 - (year - 1901) / 100     
	 + (year - 1601) / 400;  
	days += daysToMonth[month-1];
  	if (leapYear(year) && month > 2) {
          days++;
        }
	days += day - 1;
     }

     return days;
  }
  
  static int DayOfWeek (int month, int day, int year) {
    return (int)((DAY0 + DaysSince1900(month, day, year)) % 7);
  }
}
