package shapes;

import java.math.BigDecimal;

public abstract class Shape { // implicity extends object 

  public abstract double area(); // area()

  public static void main(String[] args) {
    double total = 0.0d;
    BigDecimal b = BigDecimal.valueOf(total);
    b = b.add(BigDecimal.valueOf(5));
    System.out.println(b.doubleValue()); // 5.0

    // Shapes area() sample
    Circle10 circle = new Circle10((10.0d));
    Square10 sqaure = new Square10((3.0d));
    Shape[] shapes = new Shape[] {circle, sqaure};//
    System.out.println(Shape.area(shapes));
  }

  // Factory Pattern
  public static double area(Shape[] shapes) {
    BigDecimal total = BigDecimal.valueOf(0);

    for (Shape s : shapes) {
      total = total.add(BigDecimal.valueOf(s.area()));
    }
    return total.doubleValue();
  }
}
