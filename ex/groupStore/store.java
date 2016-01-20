package storeproject;

import java.util.ArrayList;

public class Store {
	private String location;
	ArrayList<Item> items = new ArrayList<Item>();
	private String owner;
	private String phone_number;
	private String name;
       
	  
	public Store() {
            location = "USA";
	    owner = "Nik";
	    phone_number = "173-817-3817";
	}	  
	public Store (String l, Item[] i, String o, String p, String n) {
	    location = l;
	    owner = o;
	    phone_number = p;
	    name = n;
	 }
	 public Item getItem(int id)
         {
             for(int ii=0; ii < items.size();ii++)
             {
                 Item item=items.get(ii);
                 if (item.getiNum()==id)
                 {
                     return item;
                 }
             }
             return null;
         }
         public Item getItem(String name)
         {
             for(int ii=0; ii < items.size();ii++)
             {
                 Item item=items.get(ii);
                 if (item.getName().equals(name))
                 {
                     return item;
                 }
             }
             return null;
         }
	 public ArrayList<Item> getItems() 
         {
	    return items;
	 }
	 public String getLocation() 
         {
             
	    return location;
	 }
	 public String getOwner() 
         {
	    return owner;
	 }	  
	 public String getPhoneNumber() 
         {
	    return phone_number;
	 }        
	 //Set 1 item in a certain place in the array
	
	 //Set an array of multiple items
	 public void setLocation(String l) 
         {
	    location = l;
	 }
	 public void setOwner(String o) 
         {
	    owner = o;
	 }
	 public void setPhoneNumber(String p) 
         {
	    phone_number = p;
	 }
	 public void setName(String n) 
         {
            name = n;
	 }
         
}
