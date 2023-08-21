public class TestStringBuilder {

  String str = "";

  public static void main(String[] args) {
    StringBuilder sbuilder = new StringBuilder();
    // sbuilder ( reference ) -> object 
    Runnable appendS = () -> {
      for (int x = 0; x < 1000000; x++) {
        sbuilder.append("s");

      }
    };

    Thread thread1 = new Thread(appendS);
    Thread thread2 = new Thread(appendS);
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(sbuilder.length());

  }
}
