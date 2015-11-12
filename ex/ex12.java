import java.util.Scanner;
import javax.swing.JOptionPane;

// Nikolay Pomytkin
// Lab #1
// September 29 2015
public class ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String firstname  = scan.nextLine();
		System.out.println("Enter your middle name:");
		String middlename = scan.nextLine();
		System.out.println("Enter your last name:");
		String lastname = scan.nextLine();
		scan.close();
		double [] dfines = new double[10];
		double totalfine = 0;
		String input;
		for (int i = 0; i < dfines.length; i++) {
			input = JOptionPane.showInputDialog(null, "Enter book fine #" + (i + 1));
			dfines[i] = Double.parseDouble(input);
			totalfine += dfines[i];
		}
        double smallest = dfines[0];
        double largest = dfines[0];
        for(int i=1; i < dfines.length; i++)
        {
                if(dfines[i] > largest)
               	{
                	largest = dfines[i];
                }
                else if (dfines[i] < smallest)
                {
                    smallest = dfines[i];
                }
        }
		System.out.println(firstname + " " + middlename + " " + lastname + ", Your total fine is " + totalfine + ". Your smallest fine is: " + smallest + " and your largest fine is: " + largest + ".");
	}

}
