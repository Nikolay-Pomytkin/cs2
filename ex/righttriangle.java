import java.util.Scanner;
public class righttriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double side1, side2, hypotenuse, temp;
        System.out.println("What does side one equal?");
        side1 = sc.nextDouble();
        System.out.println("What does side two equals?");
        side2 = sc.nextDouble();
        temp = (side1* side1) + (side2 * side2);
        hypotenuse = Math.sqrt(temp);
        System.out.println("Your hypotenuse is: " + hypotenuse);
        System.out.println("Would you like to input the alpha or beta angle?");
        String angleType = sc.next();
        double alpha, beta;
        if (angleType.equals("alpha")){
        	System.out.println("What do you want the value to be?");
            alpha = sc.nextDouble();
            beta = 180 - (90 + alpha);
            System.out.println("Your beta value is: " + beta);
        } else {
            System.out.println("What do you want the value to be?");
            beta = sc.nextDouble();
            alpha = 180 - (90 + beta);
            System.out.println("Your alpha value is: " + alpha);
        }
    }
}
