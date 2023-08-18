
import java.util.Vector;

public class TestVector {

  Vector<Integer> integers = new Vector<>();

  public static void main(String[] arg) {
    TestVector t = new TestVector();

    Runnable addInteger = () -> {
      for (int i = 0; i < 1000000; i++) {
        t.integers.add(1);
      }
    };

    Thread thread1 = new Thread(addInteger);
    Thread thread2 = new Thread(addInteger);
    thread1.start();
    thread2.start();
    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(t.integers.size());

  }
}
