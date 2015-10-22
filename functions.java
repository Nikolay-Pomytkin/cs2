package tests;

public class functions {

	public static void main(String[] args) {
		double dog = squareroot(16);
		System.out.println("The square root is: " + dog);
	}
	
	public static double squareroot (int num){
		double z =  Math.sqrt(num);
		return z;
	}
}
