public class TestInteger {
  Integer number = Integer.valueOf(0);

  public static void main(String[] args) {
    TestAtomic i = new TestAtomic();
    // i.number++; // Non-Atomic Operation
    // System.out.println(i.number); // 1

    Runnable increment = () -> {
      for (int x = 0; x < 100000; x++) {
        // i.number++;
      }
    };

    Thread thread1 = new Thread(increment);
    Thread thread2 = new Thread(increment);

    thread1.start();
    thread2.start();

    try{
      thread1.join();
      thread2.join();
    } catch(InterruptedException e){
    }
    System.out.println(i.number);
  }
}
