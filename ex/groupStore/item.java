package storeproject;

public class Item {
	private String name;
	private String description;
	private double buyer_price;
        private int stock;
  public Item(){
      name = "Item1";
      description = "Great item";
      buyer_price = 1.25;
      stock = 100;
  }
  public Item(String d, double b, String n, int s) {
    name = n;
    description = d;
    buyer_price = b;
    stock = s;
  }
  public void remove(){
      name = null;
      description = null;
      buyer_price = 0;
      stock = 0;
  }
  public String getName() {
      return name;
  }
  public String getDescription() {
      return description;
  }
  public int getStock() {
      return stock;
  }
  public double getBuyerPrice() {
      return buyer_price;
  }
  public void setName(String n){
      name = n;
  }
  public void setDescription(String d){
      description = d;
  }
  public void setStock(int s){
      stock = s;
  }
  public void setBuyerPrice(double b){
      buyer_price = b;
  }
}
