public class DemoThread {
    public static void main(String[] args) {
        // Approach 1: Runnable ( lambda ) to implement Thread

        // Task logic
        Runnable printout = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("i = " + i);
            }
        }; // step 4

        // Task
        Thread thread = new Thread(printout); // Task Mangament

        System.out.println("start thread"); // step 1
        thread.start(); // step 2
        System.out.println("end thread"); // step 3

        // Approach 2: Createt PrintOut Class impelemnt Runnable

        Thread thread2 = new Thread(new PrintOut());

        System.out.println("start thread"); // step 1
        thread2.start(); // step 2
        System.out.println("end thread"); // step 3

        // approach 3: Create PrintOut2 Class extends Thread
        Thread thread3 = new PrintOut2();
        thread3.start();

        try {
            thread.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {

        }
        System.out.println("Main Thread Ends");
    }
}
