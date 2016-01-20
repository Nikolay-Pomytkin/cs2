package storeproject;
import javax.swing.JOptionPane;
import storeproject.Item;
import storeproject.Store;
public class StoreProject{
  public static void main(String [] args){
    Boolean running = true;
    Store s = new Store();
    s.setName(JOptionPane.showInputDialog(null, "What is the name of your store?"));
    s.setLocation(JOptionPane.showInputDialog(null, "Where is your store located?"));
    s.setOwner(JOptionPane.showInputDialog(null, "Who is the owner of your store?"));
    s.setPhoneNumber(JOptionPane.showInputDialog(null, "What the the phone number of your store?"));
    while(running){
      System.out.println("Select an option (1-4):");
      System.out.println("1: Add an item to your store");
      System.out.println("2: Search for an item in your store");
      System.out.println("3: Remove an item from your store");
      System.out.println("4: Buy an item from the store:");
      System.out.println("5: Exit this application");
      String o = JOptionPane.showInputDialog(null, "Select an option (1-4): ");
      int option = Integer.parseInt(o);
      //int option = scan.nextInt();
      System.out.println(option);
        if (option == 1) {
                String iName = JOptionPane.showInputDialog(null, "What would you like to make your item name?");
                String iDesc = JOptionPane.showInputDialog(null, "What would you like to make your item description?");
                double iPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "What would you like to make your item buyer price?"));
                int iStock = Integer.parseInt(JOptionPane.showInputDialog(null, "How many " + iName + " do you have in stock?"));
                Item a = new Item(iDesc, iPrice, iName, iStock);
                s.items.add(a);
        } else if(option == 2){
                String search = JOptionPane.showInputDialog(null, "Would you like to search by item number or name?");
                if (search.equals("number")){
                    int numI = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the number of your item?"));
                    System.out.println("Name: " + s.items.get(numI).getName());
                    System.out.println("Description: " + s.items.get(numI).getDescription());
                    System.out.println("Buyer Price: $" + s.items.get(numI).getBuyerPrice());
                    System.out.println("Amount left in stock: " + s.items.get(numI).getStock());
                } else if (search.equals("name")){
                    String nameI = JOptionPane.showInputDialog(null, "What is the name of the item you are searching for?");
                    for (Item i : s.getItems()) {
                        if(i.getName().equals(nameI)){
                            System.out.println("Name: " + i.getName());
                            System.out.println("Description: " + i.getDescription());
                            System.out.println("Buyer Price: $" + i.getBuyerPrice());
                            System.out.println("Amount left in stock: " + i.getStock());                        
                        }
                    }
                }
        } else if (option == 3){
                int remove = Integer.parseInt(JOptionPane.showInputDialog(null, "What number of the item would you like to remove from your store?"));
                s.items.get(remove).remove();
        } else if (option == 4){
                int iNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Which item (by number) would you like to buy?"));
                s.items.get(iNum).setStock((s.items.get(iNum).getStock()) - 1);
                System.out.println("You have bought 1 " + s.items.get(iNum).getName());
        } else if (option == 5){
                System.out.println("You have quit the application.");
                running = false;
        } else{
                throw new IllegalArgumentException("You have entered an incorrect parameter.");
        }
    }
  }
}
