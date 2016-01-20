package storeproject;

public class Item {
	private String name;
	private String description;
	private double buyer_price;
        private int stock;
        private int iNum;
  public Item(){
      name = "Item1";
      description = "Great item";
      buyer_price = 1.25;
      stock = 100;
  }
  public Item(String d, double b, String n, int s, int numb) {
    setName(d);
    setDescription(d);
    setBuyerPrice(b);
    setStock(s);
    setiNum(numb);
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
  public int getiNum()
  {
      return iNum;
  }
  public void setName(String n){
      name = n;
  }
  public void setDescription(String d){
      description = d;
  }
  public boolean setStock(int s)
  {
      if(s<0)
      {
          return false;
      }
      stock = s;
      return true;
  }
  public boolean setBuyerPrice(double b)
  {
      if(b<0)
      {
          return false;
      }
      buyer_price = b;
      return true;
  }
  public boolean setiNum (int n)
  {
      if(n<0)
      {
          return false;
      }
      iNum = n;
      return true;
  }
}
