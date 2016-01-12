package store;
import java.util.Scanner;
import store.store;
import store.item;
public class storeProject{
  private static void main(String [] args){
    Boolean running = true;
    Scanner scan = new Scanner(System.in);
    store s = new store();
    System.out.println("What is the name of your store?");
    s.setName(scan.next());
    System.out.println("Where is your store located?");
    s.setLocation(scan.next());
    System.out.println("Who is the owner of your store?");
    s.setOwner(scan.next());
    System.out.println("What the the phone number of your store?");
    s.setPhoneNumber(scan.next());
    while(running == true){
      System.out.println("Select an option (1-4):");
      System.out.println("1: Add an item to your store");
      System.out.println("2: Search for an item in your store");
      System.out.println("3: Remove an item from your store");
      System.out.println("4: Buy an item from the store:");
      System.out.println("5: Exit this application");
      int option = scan.nextInt();
      if (option == 1){
        System.out.println("What would you like to make your item name?");
        s.setItems();
        System.out.println("What would you like to make your item description?");
        System.out.println("What would you like to make your item buyer price?");
      } else if (option == 2){
        System.out.println("");
      } else if (option == 3){
        System.out.println("");
      } else if (option == 4){
        System.out.println("");
      } else if (option == 5){
        System.out.println("");
      } else {
      
      }
    }
  }
}
