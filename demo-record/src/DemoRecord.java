import java.util.HashSet;
import java.util.Set;

public class DemoRecord {
    public static void main(String[] args) {
        Person person = new Person("john", 30);
        Person1 person1 = new Person1("john", 30);
        Person1 anotherPerson = new Person1("john", 30);

        System.out.println(person.getAge()); // 30
        System.out.println(person1.age()); // 30


        System.out.println(person.getName()); // John
        System.out.println(person1.name()); // John


        System.out.println(person1.equals(anotherPerson));
        System.out.println(person1);

        System.out.println(person1.hashCode() == anotherPerson.hashCode());

        // HashMap, Set -> equals(), hashCode
        Set<Person1> set = new HashSet<>();
        set.add(person1);
        System.out.println(set.add(anotherPerson));
    }
}
