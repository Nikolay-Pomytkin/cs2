import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your order:");
    System.out.println("Next Item (0 to quit) --> ");
    String one = sc.nextLine();
    if(one.equals("0")){System.exit(1);}
    System.out.println("Next Item (0 to quit) --> ");
    String two = sc.nextLine();
    if(two.equals("0")){System.exit(1);}
	String[] oneA;
	oneA = new String[2];
	oneA = one.split(" ", 2);
	String[] twoA;
	twoA = new String[2];
	twoA = two.split(" ", 2);
	double Cost = 0;
	if(oneA[1].equals("h")){
		Cost += 1.19 * Integer.parseInt(oneA[0]);
	} else if(oneA[1].equals("c")){
		Cost += 1.39 * Integer.parseInt(oneA[0]);
	}
	if(twoA[1].equals("h")){
		Cost += 1.19 * Integer.parseInt(twoA[0]);
	} else 	if(twoA[1].equals("c")){
		Cost += 1.39 * Integer.parseInt(twoA[0]);
	}
  	System.out.println("Total: $" + Cost );
  	System.out.println("Sales tax: $" + (Cost*0.05));
  	Cost = Cost * 1.05;
  	System.out.println("Total amount due: $" + Cost);
  }
}
