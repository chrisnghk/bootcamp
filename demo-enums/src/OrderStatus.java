public enum OrderStatus {
  ORDERED(0), //
  PAID(1), //
  SHIPPED(2), //
  COMPLETE(3)//
  ;

  private int id;

  private OrderStatus(int id) {
    this.id = id;
  }

  private int getID() {
    return this.id;
  }

  public boolean isForward(OrderStatus status) {
    return status.getID() > this.id;
  }

  public static void main() {
    System.out.println(OrderStatus.PAID.isForward(OrderStatus.ORDERED));
  }
}
