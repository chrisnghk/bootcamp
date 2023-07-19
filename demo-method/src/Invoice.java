import java.util.Arrays;

public class Invoice {

  // A method to calculate item total prices
  public static double calcTotaItemPrice(int quantity, double unitPrice) {
    return quantity * unitPrice;
  }

  public static double[] calcTotalItemPriceA(int[] quantity, double[] unitPrice){
    double[] price = new double[quantity.length];
    for ( int i = 0;i<quantity.length;i++){
      price[i] = quantity[i] * unitPrice[i];
    }
    return price;
  }

  // public static double
  // A method to calculate total amunt of the invoice
  public static double calcTotalInvoiceAmount(double[] totalItemPrices) {
    double total = 0;
    for (int i = 0; i < totalItemPrices.length; i++) {
      total += totalItemPrices[i];
    }
    return total;
  }


  public static void main(String[] args) {
    int[] quantities = new int[] {5, 10, 4, 7, 20};
    double[] unitPrices = new double[] {10.9, 100.3, 2.1, 9.0, 1000.3};

    double[] totalPriceItem = new double[unitPrices.length]; // [54.5,....]
    for (int i = 0; i < totalPriceItem.length; i++) {
      totalPriceItem[i] = calcTotaItemPrice(quantities[i], unitPrices[i]);
    }

    // method 1 
    System.out.println(Arrays.toString(totalPriceItem));


    // method 2 
    System.out.println(Arrays.toString(calcTotalItemPriceA(quantities,unitPrices)));
    

    // Loop
    double invoiceTotalAmount = calcTotalInvoiceAmount(totalPriceItem);
    System.out.println("The invoice of total amount is " + invoiceTotalAmount);
  }
}
