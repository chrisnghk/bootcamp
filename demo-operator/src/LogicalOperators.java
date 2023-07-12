public class LogicalOperators {
  public static void main(String[] args) {
    boolean isExpensive = true, isWorthToBuy = false;
    boolean result = isExpensive && isWorthToBuy; // && Operator ( AND )
    System.out.println(result);

    // || operator ( OR )
    boolean result2 = isExpensive || isWorthToBuy;
    System.out.println(result2);

    int a = 5, b = 10, c = 13;
    boolean result3 = a > 6 && b < 12;
    boolean result4 = a > 6 && b < 12 || c < 15;
    System.out.println("result 3 = " + result3);
    System.out.println("result 4 = " + result4);

    // ==, >=, <=
    boolean result7 = a == b, result8 = a >= 5, result9 = c <= 13,
        result10 = c != 13;
    System.out.println("result7 = " + result7);
    System.out.println("result8 = " + result8);
    System.out.println("result9 = " + result9);
    System.out.println("result10 = " + result10);



    // Operators Precedence
    int result13 = (1 + 9) * 3; // 30
    int result14 = ++result13 + 1; // 32
    int i = 27;
    int result15 = i++ + 1;// result15=28 , i=28
    System.out.println("result15 = " + result15 + " result i = " + i);

    boolean result16 = 25 + 2 < result15 + 1;
    System.out.println("result16 = " + result16);

    //
    int x = 5, y = 10, z = x += 3 * y;
    System.out.println("result x = " + x);
    
    x = 5;
    int result17 = (x++ + 2) * x++;
    System.out.println("result17 = " + result17);
    System.out.println("x = " + x );

  }
}
