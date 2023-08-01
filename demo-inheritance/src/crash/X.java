package crash;

public class X extends Y {

  private String name;

  public X() {

  }

  public X(String name) {
    super("John");
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getParentNmae() {
    return super.getName();
  }

  public static void staticMethod() {
    System.out.println("I am X");
  }

  public static void main(String[] args) {
    X x = new X("Peter");
    System.out.println(x.getName());// Peter
    System.out.println(x.getParentNmae());// John

    // Hiding
    Y y = new X("Tommy");
    y.staticMethod(); // I am Y, Hiding
    // You shoud practice and understand below syntax
    Y.staticMethod(); // I am Y
    X.staticMethod(); // I am X
    System.out.println(y.getName());// Tommy
  }

}
