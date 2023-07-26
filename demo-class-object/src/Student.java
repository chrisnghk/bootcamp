public class Student {

  private String firstName;
  private String lastanme;
  private int age;


  // all -arguments constructor -> object ( instance)
  public Student(String firstName, String lastName, int age) {
    this.firstName = firstName;
    this.lastanme = lastName;
    this.age = age;
  }


  // Behaviors / Method

  public String fullName() {
    return this.firstName.concat(" ").concat((this.lastanme));
  }

  public boolean isAdult() {
    // if (this.age >= 18)
    // return true;
    // return false;
    // return this.age >= 18 ? true : false;
    return this.age >= 18;
  }

  public static boolean isAudlt(int age) {
    return age >= 18;
  }

  // public String getFirstName() {
  // return this.firstName;
  // }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  // public String getLastName() {
  // return this.lastanme;
  // }

  public void setLastName(String lastName) {
    this.lastanme = lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
