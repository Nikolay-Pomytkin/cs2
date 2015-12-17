import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class holiday {
	public static void main(String[] args) {
		//Labor Day (first Monday in september) Memorial Day (last Monday in may) Thanksgiving (4th Thursday in November) Election Day (first Tuesday after the first Monday in November).
		System.out.println("What year would you like to calculate holiday dates for?");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		String pastFuture;
		if(year < Calendar.getInstance().get(Calendar.YEAR)){
			pastFuture = "took place";
		} else {
			pastFuture = "will take place";
		}
	    System.out.println(year + ": Labor Day " + pastFuture  +" on " + laborDay(year).getMonth() + "-" + laborDay(year).getMonth() + "-" + year);
	    System.out.println(year + ": Memorial Day " + pastFuture  +" on " + memorialDay(year).getMonth() + "-" + memorialDay(year).getMonth() + "-" + year);  
	    System.out.println(year + ": Thanksgiving Day " + pastFuture  +" on " + thanksgiving(year).getMonth() + "-" + thanksgiving(year).getMonth() + "-" + year);
	    }
    public static Date laborDay(int nYear) {
        int month = 8; // September
        Date dL = new Date(nYear, 9, 1);
        int num = dL.getDay();
        switch(num) {
          case 0 : // Sunday
            return new Date(nYear, month, 2);
          case 1 : // Monday
            return new Date(nYear, month, 7);
          case 2 : // Tuesday
            return new Date(nYear, month, 6);
          case 3 : // Wednesday
            return new Date(nYear, month, 5);
          case 4 : // Thursday
            return new Date(nYear, month, 4);
          case 5 : // Friday
            return new Date(nYear, month, 3);
          default : // Saturday
            return new Date(nYear, month, 2);
        }
      }
      
      public static Date memorialDay(int nYear) {
        int nMonth = 4; //May
        Date dM= new Date(nYear, 4, 31);
        int num = dM.getDay();
        switch(num) {
          case 0 : // Sunday
            return new Date(nYear, nMonth, 25);
          case 1 : // Monday
            return new Date(nYear, nMonth, 31);
          case 2 : // Tuesday
            return new Date(nYear, nMonth, 30);
          case 3 : // Wednesday
            return new Date(nYear, nMonth, 29);
          case 4 : // Thursday
            return new Date(nYear, nMonth, 28);
          case 5 : // Friday
            return new Date(nYear, nMonth, 27);
          default : // Saturday
            return new Date(nYear, nMonth, 26);
        }
      }
      
      public static Date thanksgiving(int nYear) {
        int month = 10; // November
        Date date = new Date(nYear, 10, 1);
        int num = date.getDay();
        switch(num) {
          case Calendar.SUNDAY :
            return new Date(nYear, month, 26);
          case Calendar.MONDAY :
            return new Date(nYear, month, 25);
          case Calendar.TUESDAY :
            return new Date(nYear, month, 24);
          case Calendar.WEDNESDAY :
            return new Date(nYear, month, 23);
          case Calendar.THURSDAY :
            return new Date(nYear, month, 22);
          case Calendar.FRIDAY :
            return new Date(nYear, month, 28);
          default : // Saturday
            return new Date(nYear, month, 27);
        }
}
}
