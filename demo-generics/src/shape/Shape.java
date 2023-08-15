package shape;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Shape {

  abstract double area(); // implicity public

  // public static <T extends Shape> double area(List<T> shapes) {
  public static double area(List<? extends Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO; // complie-time check, type-safe
    // shapes.add(new Circle());
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();

  }

  public static void main(String[] args) {
    // Polymorphism
    Shape shape = new Circle();
    Shape shape2 = new Square();
    ArrayList<Shape> shapes = new ArrayList<Shape>();
    // shapes = new ArrayList<circle>();// compile-error
    List<? extends Shape> list = new ArrayList<>();
    list = new ArrayList<Square>(); // ok
    list = new ArrayList<Shape>(); // ok
    // list.add(new Circle()); // compile check refer declaration

    List<Map<String, String>> list2 = new ArrayList<>();
    list2.add(new HashMap<>());


  }
}
