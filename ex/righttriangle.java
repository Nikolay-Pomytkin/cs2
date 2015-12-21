package cs2;
import java.util.Scanner;

public class righttriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of side x: ");
        double s1 = in.nextDouble();
        System.out.println("Enter the length of side z: ");
        double s2 = in.nextDouble();
        System.out.println("are you entering angle alpha or beta");
        String type = in.next();
        double s3 = Math.sqrt((s1 * s1) + (s2 * s2));
        if(type.equals("beta")){
            System.out.println("Enter the value of angle beta");
            double beta = in.nextDouble();
            double alpha = 180 - (beta + 90);
            System.out.println("The length of angle beta: " + beta);
            System.out.println("The length of angle alpha: " + alpha);
        } else {
            System.out.println("please enter the value of angle alpha");
            double alpha = in.nextDouble();
            double beta = 180 - (alpha + 90);
            System.out.println("The length of angle beta is: " + beta);
            System.out.println("The length of angle alpha is: " + alpha);
        }
        System.out.println("The length of side x is: " + s1);
        System.out.println("The length of side z is: " + s2);
        System.out.println("The length of side y is: " + s3);
    }
    
}
