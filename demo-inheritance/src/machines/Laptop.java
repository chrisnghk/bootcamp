package machines;
public class Laptop extends Machine {
  // Laptop is subclass (child ),Machine is superclass ( parent )
  // Inhermit Machine attribute(" double weight")
  // Inhermit Machine methods(start() and stop)

  Keyboard keyboard;
  Monitor monitor;

  private int volume;

  // subclass must call superclass constructor

  public Laptop() {
    // super(); // new Machine();
    // implicitly call superclass emtpy constructor
    // new machine()
  }

  public Laptop(Keyboard keyboard, Monitor monitor) {
    // implicitly call superclass emtpy constructor
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  public Laptop(String buttonType, int noOfButton, double length,
      double width) {
    // implicitly call superclass emtpy constructor
    this.keyboard = new Keyboard(buttonType, noOfButton);
    this.monitor = new Monitor(length, width);
  }

  public Laptop(double weight, Keyboard keyboard, Monitor monitor) {
    super(weight); // super() + this.setWeight(weight);
    this.keyboard = keyboard;
    this.monitor = monitor;
  }

  @Override // Method Overriding
  public void start() {
    super.start(); // Machine Start;
    System.out.println("Laptop Stop ...");
  }

  @Override // Method Overriding
  public void stop() {
    System.out.println("Laptop Stop ...");
  }

  public void mute() {
    this.volume = 0;
  }

  public static void main(String[] args) {
    Laptop laptop = new Laptop("abc", 100, 15, 10);
    laptop.setWetght(3.0);
    System.out.println(laptop.getWeight()); // 3.0
    laptop.start(); // Machine start
    laptop.stop(); // Machine Stop

    Machine machine = new Machine(); // weigth 0.0
    machine.setWetght(5.0d);
    System.out.println(machine.getWeight()); // 0.0
    machine.start(); // Machine start
    machine.stop(); // Machine stop


    Laptop laptop2 = new Laptop();
    laptop2.setWetght(10.0d);
    System.out.println(laptop2.getWeight());

    Laptop laptop3 = new Laptop();
    System.out.println(laptop3.getWeight());
    System.out.println(Machine.staticMethod("abc", "def")); // abcdef
    System.out.println(Laptop.staticMethod("abc", "def")); // abcdef
    // laptop3.staticMethod("abc", "def"); // not recommened

  }


}
