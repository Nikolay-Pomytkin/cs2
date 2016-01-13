package storeproject;

public class Store {
	private String location;
	private Item [] items;
	private String owner;
	private String phone_number;
	private String name;
	  
	public Store() {
            location = "Nigeria";
	    items = new Item [15];
	    owner = "Chuba Akpom";
	    phone_number = "173-8173-81738";
	}
	  
	public Store (String l, Item[] i, String o, String p, String n) {
	    location = l;
	    items = i;
	    owner = o;
	    phone_number = p;
	    name = n;
	 }
	 public Item getItem(int id){
             return items[id];
         }
	 public Item[] getItems() {
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
		 items[z] = i;
	 }
	 //Set an array of multiple items
	 public void setItems(Item[] i) {
	    items = i;
	 }
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
