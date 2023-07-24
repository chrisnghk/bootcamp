public class Computer {
  // arttributes

  private int ram;
  private int weight;
  private String color;

  // Constructors

  public Computer() { // (1) No return type, (2) Constructor name = Class name
    ;
  }

  public Computer(String color) {
    this.color = color;
  }


  public Computer(int ram, int weight, String color) {
    this.ram = ram;
    this.weight = weight;
    this.color = color;
  }


  // method

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getRam() {
    return this.ram;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public int getWeight() {
    return this.weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }

}
