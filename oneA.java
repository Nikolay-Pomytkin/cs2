package aone;

import java.util.Scanner;

public class Aone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\u001B[31m" + "Enter an integer:");
        int i1 = scan.nextInt();
        System.out.println("Enter a double:");
        double d1 = scan.nextDouble();
        System.out.println("Squareroot of integer: " + Math.sqrt(i1));
        System.out.println("Squareroot of double: " + Math.sqrt(d1));
        System.out.println("Absolute value of integer: " + Math.abs(i1));
        System.out.println("Absolute value of double: " + Math.abs(d1));
        String even1 = "";
        String even2 = "";
        if (i1 % 2 == 0){
            even1 = "even";
        } else {
            even1 = "odd";
        }
        if (d1 % 2 == 0){
            even2 = "even";
        } else {
            even2 = "odd";
        }
        System.out.println("The integer is: " + even1);
        System.out.println("The double is: " + even2);
        System.out.println("Integer squared: " + (i1 * i1));
        System.out.println("Double squared: " + (d1*d1));
        System.out.println("Enter an exponent to apply to the integer: ");
        int e1 =  scan.nextInt();
        System.out.println("Power applied to integer: "+Math.pow(i1, e1));
        System.out.println("Enter an exponent to apply to the double: ");
        double e2 =  scan.nextDouble();
        System.out.println("Power applied to integer: "+Math.pow(d1, e2));
        System.out.println("Enter another integer:");
        int i2 = scan.nextInt();
        System.out.println("Enter another double:");        
        double d2 = scan.nextDouble();
        if (Math.max(d1, d2) == d1){
            System.out.println("The first double was larger.");
        } else if (Math.max(d1, d2) == d2){
            System.out.println("The second double was larger.");
        }
        System.out.println("The sum of the integers is: " + (i1 + i2));
        System.out.println("The sum of the doubles is: " + (d1 + d2));
        System.out.println("The product of the integers is:" + (i1 * i2));
    }
}
