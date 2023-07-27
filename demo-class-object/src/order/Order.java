package order;
public class Order {
  
  private Transaction[] transactions;

  public Order(Transaction[] transactions){
    // Pass by reference
    this.transactions = transactions;
  }

  // getTotal() -> sum up subtotal

  public double getTotal(){
    double sum =0.0d;
    for (int i = 0;i< this.transactions.length;i++){
      sum += this.transactions[i].getSubtotal();
    }
    return sum;
  }
  
}
