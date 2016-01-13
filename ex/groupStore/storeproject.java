package storeproject;
import java.util.Scanner;
public class StoreProject{
  public static void main(String [] args){
    Boolean running = true;
    Scanner scan = new Scanner(System.in);
    Store s = new Store();
    System.out.println("What is the name of your store?");
    s.setName(scan.nextLine());
    System.out.println("Where is your store located?");
    s.setLocation(scan.nextLine());
    System.out.println("Who is the owner of your store?");
    s.setOwner(scan.nextLine());
    System.out.println("What the the phone number of your store?");
    s.setPhoneNumber(scan.nextLine());
    while(running == true){
      System.out.println("Select an option (1-4):");
      System.out.println("1: Add an item to your store");
      System.out.println("2: Search for an item in your store");
      System.out.println("3: Remove an item from your store");
      System.out.println("4: Buy an item from the store:");
      System.out.println("5: Exit this application");
      String o = scan.nextLine();
      int option = Integer.parseInt(o);
        if (option == 1) {
                System.out.println("What would you like to make your item name?");
                String iName = scan.nextLine();
                System.out.println("What would you like to make your item description?");
                String iDesc = scan.nextLine();
                System.out.println("What would you like to make your item buyer price?");
                double iPrice = scan.nextDouble();
                System.out.println("How many " + iName + " do you have in stock?");
                int iStock = scan.nextInt();
                Item a = new Item(iDesc, iPrice, iName, iStock);
                System.out.println("What is the number of your item?");
                s.setItem(a, scan.nextInt());
        } else if(option == 2){
                System.out.println("Would you like to search by item number or name (iNum/iName)?");
                String d = scan.nextLine();
                if(d.equals("iNum")){
                    System.out.println("What is the number of your item?");
                    int numI = scan.nextInt();
                    System.out.println("Name: " + s.getItem(numI).getName());
                    System.out.println("Description: " + s.getItem(numI).getDescription());
                    System.out.println("Buyer Price: $" + s.getItem(numI).getBuyerPrice());
                    System.out.println("Amount left in stock: " + s.getItem(numI).getStock());
                } else if (d.equals("iName")){
                    System.out.println("What is the name of the item you are searching for?");
                    String nameI = scan.nextLine();
                    for (Item i : s.getItems()) {
                        if(i.getName().equals(nameI)){
                            System.out.println("Name: " + i.getName());
                            System.out.println("Description: " + i.getDescription());
                            System.out.println("Buyer Price: $" + i.getBuyerPrice());
                            System.out.println("Amount left in stock: " + i.getStock());                        
                        }
                    }
                } else {
                    throw new IllegalArgumentException("You have passed in incorrect parameters");
                }
        } else if (option == 3){
                System.out.println("What number of the item would you like to remove from your store?");
                int remove = scan.nextInt();
                s.getItem(remove).remove();
        } else if (option == 4){
                System.out.println("Which item (by number) would you like to buy?");
                int iNum = scan.nextInt();
                s.getItem(iNum).setStock((s.getItem(iNum).getStock()) - 1);
                System.out.println("You have bought 1 " + s.getItem(iNum).getName());
        } else if (option == 5){
                System.out.println("You have quit the application.");
                running = false;
        } else{
                throw new IllegalArgumentException("You have entered an incorrect parameter.");
        }
    }
  }
}
