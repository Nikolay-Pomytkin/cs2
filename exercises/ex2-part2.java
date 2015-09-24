package scannerminandmax.ex2.part2;

import java.util.Scanner;

public class ScannerMinAndMaxEx2Part2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many integers would you like to enter?");
        int amount = scan.nextInt();
        System.out.println("Enter " + amount + " integers: ");
        int[] data;
        data = new int[amount];
        String alldata = null;
        for(int i=0; i<(amount); i++){
            data[i] = scan.nextInt();
        }
        for(int i=0; i<(amount - 1); i++){
            if(i==0){
                alldata = "" + data[i];
            }
            alldata = alldata + ", " + data[i+1];            
        }
        alldata = alldata + ".";
        System.out.println("Your selected integers are: " + alldata);
        int max = 0;
        int min = 0;
        int sum = 0;
        for(int i=0; i<(amount); i++){
            max = Math.max(data[i], max);
        if(i==0){
            min = data[i+1];
        }
            min = Math.min(data[i], min);
            sum += data[i];
        } 
        double average = (double) sum / amount;
        double rootnum = Math.sqrt(sum);
        System.out.println("The smallest number of the set: " + min);
        System.out.println("The largest number of the set: " + max);
        System.out.println("The average of the set: " + average);
        System.out.println("The square root of the sum of all of the numbers in the set: " + rootnum);
    }    
}
