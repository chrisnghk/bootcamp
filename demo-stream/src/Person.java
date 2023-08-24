public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public boolean isElderly(){
    return this.age >=65;
  }
}