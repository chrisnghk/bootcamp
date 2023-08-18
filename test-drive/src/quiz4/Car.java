import java.util.Deque;
import java.util.LinkedList;

class Car {
  int speed = 100;
  static Car instance = new Car();

  private Car() {}

  public static Car getlnstance() {
    return instance;
  }

  public void setSpeed(int s) {
    this.speed = s;
  }
}


 class CarFactory {
  public static void main(String[] args) {
    Deque<Car> deque = new LinkedList<>();

    Car tesla = Car.getlnstance();
    Car toyota = Car.getlnstance();

    tesla.setSpeed(80);

    deque.add(tesla);
    deque.push(toyota);

    System.out.println(deque.getLast().speed + " " + deque.getFirst().speed);
  }
}
