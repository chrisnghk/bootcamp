import java.util.ArrayList;
import java.util.Arrays;

public class DemoArrayList {

  public static void main(String[] args) {
    // fixed-length
    // for both primitive and class
    int[] arr = new int[] {1, 3, 2};
    Integer[] integers = new Integer[] {1, 3, 2};
    // resize, create new object
    integers = new Integer[] {1, 3, 2, 4};
    // integerss[2] = "abc"; // compile-time -error

    // Declaration
    ArrayList<Integer> numbers;
    // Initialization, create ArrayList object
    numbers = new ArrayList<>();


    ArrayList<Integer> numbers2 = new ArrayList<>();
    numbers2.add(1); // length 1 array
    numbers2.add(3); // length 2 array
    numbers2.add(2); // length 3 array
    numbers2.add(4); // length 4 array
    numbers2.add(null); // length 5 array
    // numbers2.add((Interger) Long.valueOf(3)); // Cannot cast Long to Integer
    // variable-length
    System.out.println(numbers2.size());

    // Converstion, ArrayList -> Array
    Integer[] arr2 = new Integer[numbers2.size()];
    // Define output array type fpr toArray() perform ocnversion
    arr2 = numbers2.toArray(arr2);
    System.out.println(Arrays.toString(arr2));// [1,2,3,4]

    // ArrayList<int>, not support primitive

    for (int i = 0; i < numbers2.size(); i++) {
      System.out.println(numbers2.get(i)); // Possible to have IndexOutOfBonund
    }

    int original = numbers2.set(2, 100); // unbox
    System.out.println("original = " + original); // 2

    System.out.println(numbers2.isEmpty()); // false
    System.out.println(numbers2.size() == 0); // false

    ArrayList<Integer> numbers3 = new ArrayList<>();
    numbers3.add(1000);
    numbers3.add(2000);

    numbers2.addAll(numbers3); // add all item from nubmers3 to numbers2
    System.out.println(numbers2.size()); // 7

    // Remove

    numbers2.remove(2); // remove by index, remove Integer 100
    System.out.println(numbers2.size()); // 6

    numbers2.removeAll(numbers3); // remove Integer 1000, 2000
    System.out.println(numbers.size()); // 4

    System.out.println(numbers2.indexOf(1000)); // -1
    System.out.println(numbers2.indexOf(3)); // -1

    // Find the last ocurrence of element 4.
    System.out.println(numbers2.lastIndexOf(4)); // 2

    System.out.println(numbers2); // [1, 3, 4, null]

    System.out.println(numbers2.contains(3)); // true
    System.out.println(numbers2.contains(900)); // false
    System.out.println(numbers2.containsAll(numbers3)); // false

    numbers2.add(1, 4);
    System.out.println(numbers2); // [1, 4, 3, 4, null]

    numbers2.clear(); // remove all elements
    System.out.println(numbers.size());
  }
}
