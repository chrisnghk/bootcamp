import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    // 1-100
    // bomb = 45 ( random number )
    // user input : 30;
    // Next round : please input a number ( 31-100);
    // user input : 60;
    // Next round : please input a number ( 31-59);
    // user input : 45;
    // exit loop. Bomb!
    int min = 1, max = 100;
    int bomb = new Random().nextInt(100) + 1; // 1-100
    int input = 0;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.printf("Next round: Please input a number (%s-%s) : ", min,
          max);
      input = scanner.nextInt();
      if (input > max || input < min ){
        System.out.printf("Please input correct number \n");
        continue;
      }else if (input < bomb) {
        min = input + 1;
      } else if (input > bomb) {
        max = input - 1;
      }
    } while (input != bomb );
    System.out.println("Bomb! ");
  }

}
