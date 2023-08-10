package hashset1;

import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {
    // HashSet id good at handling duplicates

    // Example 1:
    HashSet<String> strings = new HashSet<>();
    strings.add("abc"); // true
    strings.add("def"); // false
    System.out.println(strings.size()); // 2

    // HashSet
    boolean result = strings.add("abc");
    System.out.println(strings.size());// 2
    System.out.println(result); // false

    if (strings.add("def")) { // false
      System.out.println("def is added");
    } else {
      System.out.println("def is not added");
    }

    // Example 2: With Override equal method
    HashSet<Coordinate> coordinates = new HashSet<>();
    Coordinate c1 = new Coordinate(1, 1);
    Coordinate c2 = new Coordinate(1, 1);
    // c1.equals(c2)
    System.out.println(coordinates.add(c1)); // true
    System.out.println(coordinates.add(c2)); // false, Coordinate equlas() return false
    // HashSet add() -> Coordinate c2.equals(any of coordinates in hashset)
    //                     -> c2.equals(c1) -> true
    //                     -> HashSet not allow duplicates
    //                     -> return false
    System.out.println(coordinates.size()); // 1

    Coordinate c3 = new Coordinate(2, 1);
    System.out.println(coordinates.add(c3)); // true, Coordinate equlas() return true
    System.out.println(coordinates.size()); // 2

    // Example 3:Without Override equals() method
    HashSet<Book> books = new HashSet<>();
    System.out.println(
        "books.add(new Book(\"Eric\")) = " + books.add(new Book("dummy","Eric"))); // true
    System.out.println(
        "books.add(new Book(\"Eric\")) = " + books.add(new Book("dummy","Eric"))); // true, diff address
    System.out.println(
        "books.add(new Book(\"Steven\")) = " + books.add(new Book("dummy","Steven"))); // true, diff address



  }
}
