public class Loops {
  public static void main(String[] args) {

    long start = System.nanoTime();
    // For Loop
    for (int i = 0; i < 0; i++) {
      System.out.println("Hello" + " i is " + i);
    }
    for (int y = 9; y > 0; y--) {
      System.out.print("y = " + y + ", ");
    }

    int sum = 0;
    int sumOddNumbersWithout5 = 0;
    for (int i = 0; i < 10; i++) {
      // odd numbers
      if (i % 2 == 1) {
        sum += i;
      }
      if (i % 2 == 1 && i != 5) {
        sumOddNumbersWithout5 += i;
      }

    }
    System.out.println();
    System.out.println("sum is " + sum);
    System.out.println("sum is " + sumOddNumbersWithout5);


    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
      if (i > 2) {
        break;
      }
    }

    // continue
    for (int i = 0; i < 6; i++) {
      System.out.println("Hello!");
      if (i > 3) {
        continue;
      }
      System.out.println("Bye!");
    }


    long finish = System.nanoTime();
    long timeElapsed = finish - start;

    System.out.println(
        "used time : " + (double) timeElapsed / 1_000_000_000 + " second");
  }
}
