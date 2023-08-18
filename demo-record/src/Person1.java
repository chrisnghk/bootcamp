public record Person1(String name, int age) implements Testinterface {
  // Immutable Objects
  // final class, support Generics
  // Support Interface, but no Parent Class ( extends Object)
  // private final String name
  // private final int age
  // All-args constructor ONLY
  // All Getters
  // No Setters ( final instance variable )
  // custom static methods, static varable
  // custom constant
  // custom instance methods
  // No other instance variables
  // Already @Override equal().hashCode(),toString()

  // int salary;


  static int counter = 0; // class variable

  static final int MAX_VALUE = 100; // constants

  public boolean isElderly(int age) {
    return age >= 65;
  }

  // Tools
  public static int add(int x, int y) {
    return x + y;

  }

  @Override
  public void read() {
    System.out.println();
  }
}
