public class TryAgain {
  static byte counter = 5;
  int beCareful = 2;

  public static void main(String[] args) {
    TryAgain q = new TryAgain();

    for (Integer i = 0; i < 2; i++) {
      counter = (byte) (i + q.beCareful);
    }
    System.out.println(counter);

  }
}
