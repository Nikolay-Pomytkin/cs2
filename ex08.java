import java.util.Random;
import java.util.Scanner;

public class ex8 {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		double [] speed = new double [5];
		for(int i = 0; i<speed.length; i++ )
		{
			System.out.println("Enter person " + (i+1) + "'s height in inches:");
			int height = scan.nextInt();
			System.out.println("Enter person " + (i+1) + "'s weight in pounds:");
			int weight = scan.nextInt();
			System.out.println("Enter person " + (i+1) + "'s stride width in inches:");
			int stride = scan.nextInt();
			System.out.println("Enter person " + (i+1) + "'s age in years:");
			int age = scan.nextInt();
			speed[i] = speed(height, weight, stride, age);
			System.out.println("Person " + (i+1) + "'s speed is: " + speed[i] + " miles an hour");
			
			
		}
		System.out.println("The winner of the race is: person #" + racewinner(speed));
		
	}
	public static double speed(int h, int w, int s, int a)
	{
		double z = Math.abs((2 * (h * 3 - w)/a * s )/ 200);
		return z;
	}
	public static int racewinner(double [] array)
	{
	    int rnd = new Random().nextInt(array.length);
		return rnd;
	}

}
