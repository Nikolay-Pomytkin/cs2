package fileio1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Fileio1 {
    public static void main(String[] args) throws FileNotFoundException {
        File data = new File("fnum1.txt");
        Scanner sc = new Scanner(data);
        ArrayList nums = new ArrayList();
        while(sc.hasNextLine()){
            nums.add(sc.nextLine());
        }
        int extra = 0;
        int numNormal = 0;
        if(nums.size() % 8 != 0){
            extra = nums.size() % 8;
            numNormal = nums.size()/8;
        }
        System.out.println("Numbers:");
        for(int i = 0; i <= (numNormal-1) * 8; i += 8){
            System.out.println(nums.get(i) + ", " + nums.get(i+1) + ", " + nums.get(i+2) + ", " + nums.get(i+3) + ", " + nums.get(i+4) + ", " + nums.get(i+5) + ", " + nums.get(i+6) + ", " + nums.get(i+7) + ".");
        }
        if (extra != 0){
            for(int a = numNormal * 8; a < (numNormal * 8 + extra); a++){
                System.out.print(nums.get(a)+", ");
            }
        }
    }
}
