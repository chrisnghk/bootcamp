public class Person { // template
  // Descibe the person by attributes
  private int age;
  private char gender;

  // ...

  public static boolean isMale(char gender) {
    if (gender == 'F') {
      return false;
    }
    return true;
  }

  public boolean isMale() {
    if (this.gender == 'F') {
      return false;
    }
    return true;
  }

  public static int add(int a, int b) {
    return a + b;
  }

  // getter
  public int getAge() {
    return this.age; // this.age
  }

  // setter
  public void setAge(int age) {
    this.age = age;
  }

  public char getGender() {
    return this.gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public static void main(String[] args) {
    String s = new String("abc"); // new an object in heap
    String s2 = "abcd"; // new an object in help
    String s3 = String.valueOf("abcde"); // new an object in heap
    Boolean b = new Boolean("true");// new an object in heap
    Boolean b2 = Boolean.valueOf("false"); // new an objectin heap
    Boolean b3 = true; // auto-box // new an objet

    Person p = new Person(); // Produce emytp person object
    Person p2 = new Person(); // Produce empty person object
    p.setAge(13);
    System.out.printf("The Age of P is %s \n", p.getAge());

    // Static vs non-static
    // static
    System.out.println(Person.isMale('F')); // -> false
    String.valueOf(123);
    // non-static
    p.setGender('M');
    System.out.println(p.isMale());

    Computer computer = new Computer(); // Computer() -> empuy constructor
    computer.setColor("RED");
    computer.setRam(128);
    computer.setWeight(2);

    Computer computer2 = new Computer("Yellow");
    computer2.getColor(); // Yellow
    computer2.setColor("Black");
    computer2.getColor(); // Black

    Computer computer3 = new Computer(20, 50, "BLUE");
    System.out.printf("this.ram = %s , this.weight = %s, this.color = %s",
        computer3.getRam(), computer3.getWeight(), computer3.getColor());

  }
}
