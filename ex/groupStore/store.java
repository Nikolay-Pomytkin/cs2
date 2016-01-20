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
	 public Item getItem(int id){
             return items.get(id);
         }
	 public ArrayList<Item> getItems() {
	    return items;
	 }
	 public String getLocation() {
	    return location;
	 }
	 public String getOwner() {
	    return owner;
	 }	  
	 public String getPhoneNumber() {
	    return phone_number;
	 }
	 //Set 1 item in a certain place in the array
	 public void setItem(Item i, int z){
		 items.add(z, i);
	 }
	 //Set an array of multiple items
	 public void setLocation(String l) {
	    location = l;
	 }
	 public void setOwner(String o) {
	    owner = o;
	 }
	 public void setPhoneNumber(String p) {
	    phone_number = p;
	 }
	 public void setName(String n) {
		  name = n;
	 }
}
