import java.util.Scanner;

public class DoWhileLoop {
  public static void main(String[] args) {
    // do-while, do first, then check condition to start looping
    int count = 0;
    do {
      System.out.println("hello");
      count++;
    } while (count < 3);

    int input = 0;
    Scanner scanner;

    do {
      scanner = new Scanner(System.in);
      System.out.print("Please a integer : ");
      input = scanner.nextInt();

      // if input is even -> continue,
      // odd -> exit loop and print the number
      // if (input)

    } while (input % 2 == 0);
    System.out.println("The number of input is " + input);
  }
}
