package joptionpane.birthday.ex4;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class JOptionPaneBirthdayEx4 
{
 
    public static void main(String[] args)
    {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String monthbirth = JOptionPane.showInputDialog(null, "What month were you born in(mm)?");
        String yearbirth = JOptionPane.showInputDialog(null, "What year were you born in?(yyyy)");
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int mbirth = Integer.parseInt(monthbirth);
        int ybirth = Integer.parseInt(yearbirth);
        int age = ((year * 12 + month) - (ybirth * 12 + mbirth))/12;
        JOptionPane.showMessageDialog(null, "Your current age is: " + age);
        if (age < 18){
            JOptionPane.showMessageDialog(null, "You are under 18.");
        }else{
            JOptionPane.showMessageDialog(null, "You are over 18.");
        }
    }
    
}
