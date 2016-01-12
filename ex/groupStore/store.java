package store;


public class store {
  private String location;
  private item[] items;
  private String owner;
  private String phone_number;
  private String name;
  
  public store() {
    location = "NYC";
    items = new item [3];
    owner = "Jon";
    phone_number = "123-456-7890";
  }
  
  public store (String location, item[] items, String owner, String phone_number, String name) {
    location = location;
    items = items;
    owner = owner;
    phone_number = phone_number;
    name = name;
  }
  
  // get
  public item[] getItems() {
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
  
  // set
  public static void setItems(item[] items) {
    items = items;
  }
  public static void setLocation(String location) {
    location = location;
  }
  public static void setOwner(String owner) {
    owner = owner;
  }
  public static void setPhoneNumber(String phone_number) {
    phone_number = phone_number;
  }
  public static void setName(String name) {
	  name = name;
  }
}
