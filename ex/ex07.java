import java.util.Scanner;

public class ex7 {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your height in inches:");
		int height = scan.nextInt();
		System.out.println("Enter your weight in pounds:");
		int weight = scan.nextInt();
		System.out.println("Enter your stride width in inches:");
		int stride = scan.nextInt();
		double speed = speed(height, weight, stride);
		System.out.println(speed+ "miles an hour");
	}
	public static double speed(int h, int w, int s){
		double z = (2 * (h * 3 - w) * s )/ 100;
		return z;
	}
}
