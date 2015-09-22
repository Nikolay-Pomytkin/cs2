//Nikolay Pomytkin
//9/17/2015
package noscannernoprintln.ex3;

import javax.swing.JOptionPane;

public class NoScannerNoPrintlnEx3 
{
    public static void main(String[] args)
    {
        String Name = JOptionPane.showInputDialog(null, "What is the player's name?");
        String score1 = JOptionPane.showInputDialog(null, "What is " + Name + "'s 1st score?");
        String score2 = JOptionPane.showInputDialog(null, "What is " + Name + "'s 2nd score?");
        String score3 = JOptionPane.showInputDialog(null, "What is " + Name + "'s 3d score?");
        int s1 = Integer.parseInt(score1);
        int s2 = Integer.parseInt(score2);
        int s3 = Integer.parseInt(score3);
        int average = (s1 + s2 + s3) / 3;
        String message = "The average of " + Name + "'s scores is: " + average;
        JOptionPane.showMessageDialog(null, message);       
    } 
}
