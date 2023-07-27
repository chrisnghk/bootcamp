package order;

public class ItemDesc {

  private String header;

  private String body;

  public ItemDesc(String header, String body) {
    this.header = header;
    this.body = body;
  }

  public static void main(String[] args) {
    ItemDesc itemDesc1 =
        new ItemDesc("Item A", "90% Discount, just for today!");
    ItemDesc itemDesc2 =
        new ItemDesc("Item B", "70% Discount, just for today!");
    Transaction t = new Transaction(1, itemDesc1, 3, 10.5);
    Transaction t2 = new Transaction(1, itemDesc2, 3, 20.5);
    Order order = new Order(new Transaction[] {t, t2});
    System.out.println(t.getSubtotal());
    System.out.println(t2.getSubtotal());
    System.out.println(order.getTotal());
  }

}
