import java.util.Scanner;

public class ex8 {

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double [] speed = new double [5];
		for(int i = 0; i<speed.length; i++ ){
			System.out.println("Enter person " + (i+1) + "'s height in inches:");
			int height = scan.nextInt();
			System.out.println("Enter person " + (i+1) + "'s weight in pounds:");
			int weight = scan.nextInt();
			System.out.println("Enter person " + (i+1) + "'s stride width in inches:");
			int stride = scan.nextInt();
			speed[i] = speed(height, weight, stride);
			System.out.println("Person " + (i+1) + "'s speed is: " + speed[i] + " miles an hour");
		}
	}
	public static double speed(int h, int w, int s){
		double z = (2 * (h * 3 - w) * s )/ 300;
		return z;
	}

}
