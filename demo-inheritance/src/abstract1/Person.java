public abstract class Person {

  private int age; // 0

  private double height; // 0.0

  public Person() {

  }

  public int getAge() {
    return this.age;
  }

  public double getHeight() {
    return this.height;
  }

  // Many contian instance method with implementation

  public void run() {
    System.out.println("I am person, running");
  }

  // May contain abstract method ( without implementation)
  public abstract void sleep();

}
