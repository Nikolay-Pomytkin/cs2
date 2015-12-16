import java.util.Scanner;
public class gasnclean {
	public static void main(String[] args) {
		double gasPrice  = 0;
		double washPrice = 0;
		double totalDue;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of Gallons of Gas: ");
		double numGallons = scan.nextInt();
		System.out.println("Enter the Type of Gas (R/P/S or N for NONE): ");
		String gasType = scan.next();
		System.out.println("Enter Y to obtain a wash or N for no wash: ");
		String wash = scan.next();
		if(gasType.equals("R")){
			gasPrice = numGallons * 1.149;
		} else if(gasType.equals("P")){
			gasPrice = numGallons * 1.199;
		} else if(gasType.equals("S")){
			gasPrice = numGallons * 1.289;
		} else if(gasType.equals("N")){
			gasPrice = 0;
		} else {
			System.out.println("Fatal Error! Incorrect Input for gasType");
			System.exit(1);
		}
		if(wash.equals("Y")){
			if(gasPrice >= 10){
				washPrice = 1.25;
			} else {
				washPrice = 3;
			}
		} else {
			System.out.println("Fatal Error! Incorrect Input for washYes_No");
			System.exit(1);
		}
		totalDue = gasPrice + washPrice;
		System.out.println("Total price of gas: $" + gasPrice);
		System.out.println("Cost of Car Wash: $" + washPrice);
		System.out.println("Total amount due: $" + totalDue);

	}
}
