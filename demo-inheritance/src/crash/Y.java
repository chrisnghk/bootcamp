package crash;

public class Y {
  private String name;

  public Y(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void staticMethod() {
    System.out.println("I am Y");
  }
}