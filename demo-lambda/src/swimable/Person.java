import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import swimable.Swimable;

public class Person implements Swimable {
  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public void swim() {
    System.out.println("Person is swimming");
  }

  public static void main(String[] args) {

    Comparator<Person> sortByNmaeDesc = (Person p1, Person p2) -> {
      return p2.name.charAt(0) > p1.name.charAt(0) ? 1 : -1;
    };
    List<Person> persons =
        Arrays.asList(new Person("Alison"), new Person("Eric"));
    Collections.sort(persons, sortByNmaeDesc);
    System.out.println(persons);
    // Person perons = new Person();
    // perons.swim();

    Swimable person1 = () -> System.out.println("Person 1 is swimming");
    person1.swim();

    Swimable person2 = () -> {
      System.out.println("Person 2 starts to swim");
      System.out.println("Person 2 stop to swim");
    };
    person2.swim();

    Swimable person3 = () -> System.out.println("Person 3 is swimming");
    person3.swim();
  }
}
