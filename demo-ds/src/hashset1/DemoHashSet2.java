package hashset1;

import java.util.HashSet;

public class DemoHashSet2 {

  public static void main(String[] args) {
    // HashSet Byte
    HashSet<Byte> bytes = new HashSet<>();
    // bytes.add(Byte.valueOf((byte) 4));// int -> byte;
    bytes.add(bytes(4)); // int -> byte -> Byte
    boolean isAdded10 = bytes.add(bytes(10)); // // int -> byte -> Byte
    System.out.println("isAdded10 = " + isAdded10); // true
    // JAva is not necessary to handle return value
    boolean isAdded2 = bytes.add(bytes(4)); // // int -> byte -> Byte
    System.out.println("isAdded2 = " + isAdded2); // false

    HashSet<Byte> bytes2 = new HashSet<>();
    bytes2.add(bytes(4));
    bytes2.add(bytes(10));
    System.out.println("bytes.equals(bytes2) = " + bytes.equals(bytes2)); // true.Byte equals()

    boolean isRemoved10 = bytes.remove(bytes(10));
    System.out.println("isRemoved10 = " + isRemoved10); // true

    bytes.clear();
    bytes2.clear();
    System.out.println("bytes.size() = " + bytes.size());
    System.out.println("bytes2.size() = " + bytes2.size());
  }

  public static Byte bytes(int num) {
    return Byte.valueOf((byte) num);
  }

}
