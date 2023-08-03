package objects;

import java.util.Objects;

public class Ball {

  private String color;

  public Ball(String color) {
    this.color = color;
  }

  @Override
  // Hash code is not uqiue representation of objet reference
  public int hashCode() {
    return Objects.hash(this.color);
  }

  @Override
  public boolean equals(Object o) { // instance method
    // if address same, value inside the object must be same
    if (this == o)
      return true;
    if (!(o instanceof Ball))
      return false;
    Ball ball = (Ball) o; // downcast
    //return ball.color.equals(this.color); // true or false
    return Objects.equals(ball.color, this.color);

  }

  @Override
  public String toString() {
    return "[color = " + this.color + "]"; // 
  }

  public static void main(String[] args) {
    Ball b1 = new Ball("Blue"); // address 1
    Ball b2 = new Ball("Blue"); // address 2
    System.out.println(b1 == b2); // false
    System.out.println(b1.equals(b2)); // true,checking color, instead of memory
    System.out.println(b1); // toString @ Override [ colur = Blue ]
    System.out.println(b1.toString()); // toString @ Override [ colur = Blue ]
  }
}