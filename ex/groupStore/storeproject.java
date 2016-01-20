package storeproject;
import javax.swing.JOptionPane;
import java.util.ArrayList;

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
      System.out.println("6: List of items");
      String o = JOptionPane.showInputDialog(null, "Select an option (1-4): ");
      int option = Integer.parseInt(o);
      //int option = scan.nextInt();
      System.out.println(option);
        if (option == 1) 
        {
            String iName = JOptionPane.showInputDialog(null, "What would you like to make your item name?");
            String iDesc = JOptionPane.showInputDialog(null, "What would you like to make your item description?");
            double iPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "What would you like to make your item buyer price?"));
            int iStock = Integer.parseInt(JOptionPane.showInputDialog(null, "How many " + iName + " do you have in stock?"));
            int iNum = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the item number of " + iName + " ?"));
            Item a = new Item(iDesc, iPrice, iName, iStock, iNum);
            s.getItems().add(a);
        } else if(option == 2)
        {
            String search = JOptionPane.showInputDialog(null, "Would you like to search by item number or name?");
            if (search.equals("number"))
            {
                int numI = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the number of your item?"));
                Item findItem= s.getItem(numI);
                if(findItem!=null)
                {
                    System.out.println("Name: " + findItem.getName());
                    System.out.println("Description: " + findItem.getDescription());
                    System.out.println("Buyer Price: $" +findItem.getBuyerPrice());
                    System.out.println("Amount left in stock: " +findItem.getStock());
                }
                else
                {
                    System.out.println("Item number " + numI + " -- Not found." );
                }
            } else if (search.equals("name"))
            {
                String nameI = JOptionPane.showInputDialog(null, "What is the name of the item you are searching for?");
                Item findItem= s.getItem(nameI);
                if(findItem!=null)
                {
                    System.out.println("Name: " + findItem.getName());
                    System.out.println("Description: " + findItem.getDescription());
                    System.out.println("Buyer Price: $" + findItem.getBuyerPrice());
                    System.out.println("Amount left in stock: " + findItem.getStock());
                } 
                else
                {
                    System.out.println("Item name " + nameI + " -- Not found." );                    
                }
            }
        } else if (option == 3)
        {
            int remove = Integer.parseInt(JOptionPane.showInputDialog(null, "What number of the item would you like to remove from your store?"));
            Item findItem=s.getItem(remove);
            if(findItem!=null)
            {
                if(s.items.remove(findItem))
                {
                     System.out.println("Item number #" + remove + " successfully removed." );
                }
                else
                {
                    System.out.println("failed to remove #" + remove );
                }
            }
            else
            {
                System.out.println("Item number " + remove + " -- Not found." );
            }                
        } else if (option == 4)
        {
            String search = JOptionPane.showInputDialog(null, "Would you like to search by item number or name?");
            Item findItem = null;
            int iQty = 0;
            if (search.equals("number"))
            {
                int iNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Which item (by number) would you like to buy?"));
                iQty = Integer.parseInt(JOptionPane.showInputDialog(null, "How many ?"));
                findItem = s.getItem(iNum);
            }
            if (search.equals("name"))
            {
                String nn = JOptionPane.showInputDialog(null, "Which item (by name) would you like to buy?");
                iQty = Integer.parseInt(JOptionPane.showInputDialog(null, "How many ?"));
                findItem = s.getItem(nn);
            }            
            if(findItem!=null)
            {
                if(findItem.getStock() >= iQty)
                {
                    findItem.setStock(findItem.getStock() - iQty);                   
                    double price = findItem.getBuyerPrice()*iQty;
                    System.out.println("You have bought  " + iQty  + " of #" +  findItem.getiNum() + " for $" + price );    
                }
                else
                {
                    System.out.println("Not enough quanity in stock");
                }                
            }
            else
            {
                System.out.println("Can not find item");
            }            
        } else if (option == 5)
        {
            System.out.println("You have quit the application.");
            running = false;
        }        
        else if (option == 6)
        {
            for(int ii=0; ii < s.items.size();ii++)
            {
                Item item=s.items.get(ii);
                System.out.println("Name: " + item.getName());
                System.out.println("Description: " + item.getDescription());
                System.out.println("Buyer Price: $" + item.getBuyerPrice());
                System.out.println("Amount left in stock: " + item.getStock()); 
            }           
        }        
        else
        {
          throw new IllegalArgumentException("You have entered an incorrect parameter.");
        }
    }
  }
}
