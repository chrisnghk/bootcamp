package order;
public class Order {
  
  private Transaction[] transactions; // items

  public Order(Transaction[] transactions){
    // Pass by reference
    this.transactions = transactions;
  }

  // getTotal() -> sum up subtotal

  public double getTotal(){
    double total =0.0d;
    for (int i = 0;i< this.transactions.length;i++){
      total += this.transactions[i].getSubtotal(); //object.method()
    }
    return total;
  }
  
}
