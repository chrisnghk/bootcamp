import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
  public static void main(String[] args){
    // One Table ( Persons ) -> Many Records ( Where age > 60 )
    // Test getFromdb
    System.out.println(getFromDb("Lau").toString());
        System.out.println(getFromDb("Chan").toString());

      // flatMap()
      List<String> addresses = new ArrayList<>();
      addresses.add("Hong Kong");
      addresses.add("Mainland");
      addresses.add("Japan");
      Person2 p1 = new Person2("Ann",addresses);

      List<String> addresses2 = new ArrayList<>();
      addresses2.add("Taiwan");
      addresses2.add("US");
      Person2 p2 = new Person2("Ann",addresses2);

      List<Person2> persons = new ArrayList<>();
      persons.add(p1);
      persons.add(p2);
      System.out.println(getAllAddresses(persons));

      // return all addresses ( List<String> )from List<Person>
  }

  public static List<String> getAllAddresses(List<Person2> persons){
    return persons.stream() //
          .flatMap(person -> person.getAddresses().stream())
          .collect(Collectors.toList());
  }

  public static List<String> getAllAddresses2(List<Person2> persons){
    List<String> addresses = new ArrayList<>();
      for (Person2 person : persons){
        for ( String address : person.getAddresses() ){
          addresses.add(address);
        }
      }
    return addresses;
  }


  public static List<String> getFullNames(String lastName) {
    // List of Person
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // stream, last name = lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) // p means T ( T -> Person)
        .map(p -> p.getName()) // Conversion: from List<Person> to List<String>
        .collect(Collectors.toList()); // List<String>
  }

    public static List<String> getFullNames2(String lastName) {
    // List of Person
    List<Person> persons = new ArrayList<>();

    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));

    List<String> names = new ArrayList<>();
    for ( Person p : persons){
      if (p.getName().endsWith(lastName)){
        names.add(p.getName());
      }
    }
    return names;
  }

  public static List<Person> getFromDb(String lastName) {
    // Call Database, and returned a List of Person
    // SQL -> filter by lastname ( where last_name = lastName)
    // List of Person
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John Chan"));
    persons.add(new Person("Eric Lau"));
    persons.add(new Person("Peter Lau"));
    // stream, last name = lau
    return persons.stream() //
        .filter(p -> p.getName().endsWith(lastName)) //
        .collect(Collectors.toList());
  }
}
