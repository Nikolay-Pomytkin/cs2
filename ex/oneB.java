package oneB;
import java.util.Scanner;
public class oneB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the first leg of your right triangle:");
        int a = scan.nextInt();
        System.out.println("Enter the length of the second leg of your right triangle:");
        int b = scan.nextInt();
        double hypotenuse = Math.sqrt((a*a)+(b*b));
        System.out.println("The hyponetuse: " + hypotenuse);
    }    
}
