package exercises;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class ex6 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		
		int currentdays = (year * 365) + (month * 30) + day;
        String monthbirth = JOptionPane.showInputDialog(null, "What month were you born in(mm)?");
        String yearbirth = JOptionPane.showInputDialog(null, "What year were you born in?(yyyy)");
        String daybirth =  JOptionPane.showInputDialog(null, "What day of the month were you born on(dd)?");
        int mbirth =  Integer.parseInt(monthbirth);
        int ybirth = Integer.parseInt(yearbirth);
        int dbirth = Integer.parseInt(daybirth);
        int birthdays = (ybirth * 365) + (mbirth * 30) + dbirth;
        int days = currentdays - birthdays;
        int yearsage = days / 365;
        int daysage = days % 365;
        System.out.println("You are: "+ yearsage + " years and " + daysage+ " days old.");
	}

}
