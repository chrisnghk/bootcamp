public class TestSynchroizedLock {

  int x;
  Object lock = new Object();

  public int calculate(int amount) {
    int total = amount;
    synchronized (lock) {
      x++;
    }
    // codes ....
    // CAn be more than one synchronize code block
    // synchronized ( this.lock ){
    // this.x++;
    // }

    // this.increment(); // x++
    return total + this.x;
  }

  // public synchronized void increment() {
  // this.x++;
  // }

  public static void main(String[] args) {
    TestSynchroizedLock obj = new TestSynchroizedLock();
    // sbuilder ( reference ) -> object
    Runnable formula = () -> {
      for (int x = 0; x < 10000; x++) {
        obj.calculate(0);

      }
    };

    Thread thread1 = new Thread(formula);
    Thread thread2 = new Thread(formula);
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(obj.x);

  }
}
