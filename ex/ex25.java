
package fileio2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Fileio2 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File data1 = new File("fileone.txt");
        File data2 = new File("filetwo.txt");
        Scanner sc1 = new Scanner(data1);
        Scanner sc2 = new Scanner(data2);
        Scanner console = new Scanner(System.in);
        ArrayList names = new ArrayList();
        while(sc1.hasNextLine()){
            names.add(sc1.nextLine());
        }
        sc1.close();
        while(sc2.hasNextLine()){
            names.add(sc2.nextLine());
        }
        sc2.close();
        Collections.sort(names);
        File newFile = new File("mergedfile.txt");
        if(newFile.createNewFile()){
            System.out.println("Mergedfile.txt has been created.");
        }
        PrintWriter pw = new PrintWriter(newFile);
        for(int i = 0; i < names.size(); i++){
            pw.println(names.get(i));
        }
        pw.close();
        System.out.println("Would you like the file displayed?");
        String display = console.next();
        if(display.equals("y")){
            for(int i = 0; i < names.size(); i++){
                System.out.println(names.get(i));
            }
        }
    }
    
}
