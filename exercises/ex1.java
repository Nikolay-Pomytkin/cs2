package mathandscanner.ex1;

import java.util.Random;
import java.util.Scanner;

public class MathAndScannerEx1 {


    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(10)+1;
        System.out.println("The random integer is: " + i);
        System.out.println("Enter an integer: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int result = x * i;
        System.out.println("The product of the random integer and your integer is:" + result);
    }
    
}

