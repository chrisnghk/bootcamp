package objects;

import java.util.Objects;

public class Point {
  int x;
  int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "[x=" + this.x + ", y=" + this.y + "]";
  }

  @Override
  public int hashCode(){
    return Objects.hash((this.x,this.y));
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Point))
      return false;
    Point point = (Point) o;
    // return point.x == this.x && point.y == this.y;
    return Objects.equals(point.x, this.x) //
        && Objects.equals(point.y, this.y);
  }


  public static void main(String[] args) {

    Point p1 = new Point(1, 1);
    Point p2 = new Point(1, 1);
    Point p3 = new Point(1, 2);
    System.out.println(p1 == p2); // false
    System.out.println(p1.equals(p2)); // true
    System.out.println(p1.equals(p3)); // false

    System.out.println(p3); // toString @ Override address
    System.out.println(p3.toString()); // toString @ Override address
    System.out.println(Points.toString(p3)); // static method
  }

}
