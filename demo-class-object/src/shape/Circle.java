package shape;

public class Circle {

  private int id; // instance variable / attribute
  private double radius;

  // static -> shared variable
  // final -> one thime initialization ONLY
  private static final double pi = 3.14159; // static variable / class variable

  private static int counter;// calculate the number of circle objects being created

  public Circle() {
    this.id = AddCounter() + 1;
  }

  public int getId() {
    return this.id;
  }

  public static int AddCounter() {
    return counter++;
  }

  public double area() {
    return Math.pow(this.radius, 2) * pi;
  }

  public double circumference() { // instatance method
    return 2 * this.radius * pi;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public static void main(String[] args) {
    Circle c = new Circle(); // Circle;
    // circle.radius = 1;

    c.setRadius(2);
    c.area();
    c.circumference();
    Circle c2 = new Circle(); // Circle;
    c2.setRadius(2);
    c2.area();
    c2.circumference();

    System.out.println(counter);
    System.out.println("c1 getid = " + c.getId()); 
    System.out.println("c2 getid = " + c2.getId()); 
  }
}
