// before java 8,100% abstraction

public interface Move extends BigMove{

  // Constant

  static final int MAX_SPEED = 10; // public

  // Java -> naming convention -> Camlcase
  // "noOfDay"

  // Behavior

  void jump();

  void up(); // public abstract

  void down();// public abstract

  void left();// public abstract

  void right();// public abstract

  // No method implementions

  // after Java 8 , lambda , steam
  default void print() { // instance method, implicitly public
    System.out.println("I am Java 8 defalut method");
  }

  static String concat(String a, String b) { // 
    return a + b;
  }

}
