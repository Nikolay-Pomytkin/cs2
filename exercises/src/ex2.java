
import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");
        int[] data;
        data = new int[6];
        for(int i=0; i<5; i++){
            data[i] = scan.nextInt();
        }
        System.out.println("Your selected integers are: " + data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3] + ", " + data[4] + ".");
        int max = 0;
        int min = 0;
        int sum = 0;
        for(int i=0; i<5; i++){
            max = Math.max(data[i], max);
        if(i==0){
            min = data[i+1];
        }
            min = Math.min(data[i], min);
            sum += data[i];
        } 
        int average = sum / 5;
        double rootnum = Math.sqrt(sum);
        System.out.println("The smallest number of the set: " + min);
        System.out.println("The largest number of the set: " + max);
        System.out.println("The average of the set: " + average);
        System.out.println("The square root of the sum of all of the numbers in the set: " + rootnum);
    }
    
}
