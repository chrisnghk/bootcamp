public class Car {

  private int noOfWheel;
  private int capacity;
  private String color;

  // Empty Constructor
  public Car() {


  }

  // All-arguements constructor ( with all attributes)
  public Car(int noOfWheel, int capacity, String color) {
    this.noOfWheel = noOfWheel;
    this.capacity = capacity;
    this.color = color;
  }
  

  public int getNoOfWheel() {
    return this.noOfWheel;
  }

  public void setNoOfWheel(int noOfWheel) {
    this.noOfWheel = noOfWheel;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getColor() {
    return this.color;
  }
}
