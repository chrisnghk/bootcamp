import java.util.Scanner;

public class ReadInput {
  public static void main(String[] args) {

    long start = System.nanoTime();
    // scanner
    System.out.print("Please input an integer : ");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt(); // read user input , expecting it is an integer
    System.out.println("Input = " + input);

    for (int i = 0; i < input; i++) {
      System.out.println("Hello");
    }





    

    long finish = System.nanoTime();
    long timeElapsed = finish - start;

    System.out.println(
        "used time : " + (double) timeElapsed / 1_000_000_000 + " second");
  }
}
