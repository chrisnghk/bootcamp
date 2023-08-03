public class Student extends Person implements Runnable, Swimable, Move { // class signature

  private String name;

  int score;


  @Override
  public void jump() {

  }

  @Override
  public void left() {
    System.out.println("Student is moving left ");
  }

  @Override
  public void right() {
    System.out.println("Student is moving right");
  }

  @Override
  public void up() {
    score += 1;
    System.out.println("Student is moving up");
  }

  @Override
  public void down() {
    System.out.println("Student is moving down");
  }

  @Override
  public void breath() {
    System.out.println("Student is breath");
  }

  @Override
  public void run() {
    System.out.println("Student is running");
  }

  @Override
  public void swim() {
    System.out.println("Student is swimming");
  }

  public static void main(String[] args) {
    // MAX_SPEED
    System.out.println(Move.MAX_SPEED); // 10

    Move student = new Student();
    student.up();
    student.down();
    student.left();
    student.right();
    // System.out.println(move.MAX_SPEED); // NOT RECOMMEDED

    Move dog = new Dog();
    dog.up();
    dog.down();
    dog.left();
    dog.right();

    Swimable swimable = new Student();
    swimable.swim();

    Person person = new Student();
    person.breath();
    System.out.println(person.getAge());

    // System.out.println(dog.get);
    // System.out.println(student.);

  }
}
