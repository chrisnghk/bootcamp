public abstract class Adult extends Person {

  public Adult() {
    super(); // new Person();
  }
  // abstract class extends abstract class
  // implicitly "extends" abstract method

  public abstract void read();

  public void eat() {
    System.out.println("I am Adult,eating.");

    // @Override
    // public void run(){
    // System.out.println("I am Adult, runing ");
    // }

  }
}
