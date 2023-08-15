package shopping;

public abstract class Item {
  private int price;
  // int quantity;
  private String header;
  private String description;

  public Item(int price){
    this.price=price;
  }

  public void setPrice(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }

}
