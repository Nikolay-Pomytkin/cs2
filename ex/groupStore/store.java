public class Store {
  private String location;
  private Item[] items;
  private String owner;
  private String phone_number;
  
  public Store() {
    location = "NYC";
    items = new Item [3];
    owner = "Jon";
    phone_number = "123-456-7890";
  }
  
  public Store(String location, Item[] items, String owner, String phone_number) {
    location = location;
    items = items;
    owner = owner;
    phone_number = phone_number;
  }
  
  // get
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
  
  // set
  public static void setItems(Item[] items) {
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
}
