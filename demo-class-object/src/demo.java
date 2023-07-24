public class demo {
  public static void main(String[] args) {
    Car car = new Car();
    Car car2 = new Car(2, 50, "Blue");
    //
    System.out.println("This car2 Wheel = " + car2.getNoOfWheel());
    System.out.println("This car2 Capacity = " + car2.getCapacity());
    System.out.println("This car2 color = " + car2.getColor());

    //

    car2.setColor("Yellow"); // car2 -> object reference, storing the object
    car.setColor("BLUE");
    System.out.println(car2);

    CarFactory carFactory = new CarFactory();
    carFactory.changeColor(car2, "WHITE");
    System.out.println(car2.getColor()); // white

    Person person = new Person();  // Constructor
    Computer computer = new Computer();
    String str = new String("Hello"); // str -> object reference 
    System.out.println(str); // print Hello
    str.charAt(1);

  }

}
