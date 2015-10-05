package vowel.ex4;

import javax.swing.JOptionPane;

public class VowelEx4 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Enter a string:");
        int length = name.length();
        int numnumbers = 0;
        int numletters = 0;
        for(int i = 0; i < length; i++){
            if (Character.isDigit(name.charAt(i))){
                numnumbers++;
            } else {
                numletters++;
            }
        }
        char fl = name.charAt(0);
        String firstletter;
        if(fl == 'o' || fl == 'a' || fl == 'e' || fl == 'i' || fl == 'u'){
            firstletter = "is";
        } else{
            firstletter = "is not";
        }
        
        System.out.println("There are " + numnumbers + " digits in this string.");
        System.out.println("There are " + numletters + " letters in this string.");
        System.out.println("The first letter " + firstletter + " a vowel.");
                
   
    }
    
}
