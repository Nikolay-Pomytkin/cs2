package diceroller;
import java.util.Random;
import java.util.Scanner;
public class Diceroller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("How many times would you like to roll the dice?");
        int numRolls = sc.nextInt();
        int die1 [];
        int die2 [];
        int rolls [];
        int counters [];
        die1 = new int [numRolls];
        die2 = new int [numRolls];
        rolls = new int [numRolls];
        counters = new int [13];
        for(int i = 0; i < numRolls; i++){
            die1 [i] = rand.nextInt(6) + 1;
            die2 [i] = rand.nextInt(6) + 1; 
            rolls [i] = die1 [i] + die2 [i];
            if (rolls [i] == 2){
                counters[2]++;
            } else if (rolls [i] == 3){
                counters[3]++;
            } else if (rolls [i] == 4){
                counters[4]++;
            } else if (rolls [i] == 5){
                counters[5]++;
            } else if (rolls [i] == 6){
                counters[6]++;
            } else if (rolls [i] == 7){
                counters[7]++;
            }else if (rolls [i] == 8){
                counters[8]++;
            } else if (rolls [i] == 9){
                counters[9]++;
            } else if (rolls [i] == 10){
                counters[10]++;
            } else if (rolls [i] == 11){
                counters[11]++;
            } else if (rolls [i] == 12){
                counters[12]++;
            }
        }
        System.out.println("Values rolled (both dice at once):");
        System.out.println("2: "+ counters[2]);
        System.out.println("3: "+ counters[3]);
        System.out.println("4: "+ counters[4]);
        System.out.println("5: "+ counters[5]);
        System.out.println("6: "+ counters[6]);
        System.out.println("7: "+ counters[7]);
        System.out.println("8: "+ counters[8]);
        System.out.println("9: "+ counters[9]);
        System.out.println("10: "+ counters[10]);
        System.out.println("11: "+ counters[11]);
        System.out.println("12: "+ counters[12]);
        System.out.println("Sorted:");
    } 
    public int[][] sort(int[]s){
        int[][]sort;
        sort = new int[s.length][2];
        return sort;
    }
}
