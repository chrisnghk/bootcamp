/**
 * Expected output: 1 1 2 3 5 8 13 21 ...
 * 
 */
// Count the target of character in a String.
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence
    int a =1,b =0, c=0;
    System.out.print("1 ");
    for (int i = 0; i < 15; i++) {
      c = a+ b;
      b = a;
      a = c;
      System.out.print(c+" ");
    }
  }
}
