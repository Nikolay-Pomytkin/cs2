import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		System.out.println("Would you like to construct your circle based circumference, radius, or diameter?");
		System.out.println("(Type 1 for circumference, 2 for radius, 3 for diameter)");
		Scanner scan = new Scanner(System.in);
		circle c = new circle();
		c.entryType = scan.nextInt();
		if(c.entryType == 1){
			System.out.println("Enter the circumfrence and name of your circle:");
			System.out.println("Name:");
			c.name = scan.nextLine();
			System.out.println("Circumfrence:");
			c.circumference = scan.nextDouble();
		} else if (c.entryType == 2){
			System.out.println("Enter the radius and name of your circle:");
			System.out.println("Name:");
			c.name = scan.nextLine();
			System.out.println("Radius:");
			c.radius = scan.nextDouble();
		} else if (c.entryType == 3){
			System.out.println("Enter the diameter and name of your circle.");
			System.out.println("Name:");
			c.name = scan.nextLine();
			System.out.println("Diameter:");
			c.diameter = scan.nextDouble();
		}
	}
	private double radius;
	private double area;
	private double diameter;
	private double circumference;
	private String name;
	private int entryType;
	public circle(){
		name="circle";
	}
	public circle(double r, String n){
	}
	public void setName(String n){
		name = n;
	}
	public void setRadius(double r){
		radius = r;
	}
	public void setCircumference(double r){
		
	}
}
