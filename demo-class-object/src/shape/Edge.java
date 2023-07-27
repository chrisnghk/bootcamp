package shape;

public class Edge {

  private double length;
  private String color;

  public Edge(double length, String color) {
    this.length = length;
    this.color = color;
  }

  public double getLength() {
    return this.length;
  }

  public void setLength(double length){
    this.length = length;
  }
  public String getcolor() {
    return this.color;
  }

  public void setColor(String color) {
    if (this.color.isEmpty())
    this.color = color;
  }

  public String toString() {
    return this.length + " " + this.color;
  }
}
