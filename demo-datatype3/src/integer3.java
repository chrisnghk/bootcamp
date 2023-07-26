public class integer3 {

  // Inernal Cache ) -128 to 127)
  public static void main(String[] args) {
    Integer i1 = 100;
    Integer i2 = 100;
    System.out.println(i1 == i2); // address, true

    Integer i3 = 128;
    Integer i4 = 128;
    System.out.println(i3 == i4); // address, false

    Integer i5 = -128;
    Integer i6 = -128;
    System.out.println(i5 == i6); // address, false

    Byte b1 = 127;
    // Byte b2 = new Byte(127); // destory Internal Cache

    // short, Long
    Short s1 = -128;
    Short s2 = -128;
    System.out.printf("Short s1 == s2 is %s \n", s1 == s2); // address, false

    Long l1 = 128L;
    Long l2 = 128L;
    System.out.printf("Long l1 == l2 is %s  \n", l1 == l2); // address, false

    // boolean
    Boolean bool1 = false;
    Boolean bool2 = false;
    System.out.println(bool1 == bool2); // true.same address


    // Float , Double ( no cache)

    Float f1 = 1f;
    Float f2 = 1f;
    System.out.println(f1 == f2);

    Double d1 = 1d;
    Double d2 = 1d;
    System.out.println(d1 == d2);

    // Internal Cache -> ASCII
    Character c1 = 'a';
    Character c2 = 'a';
    Character c3 = 'Ϩ';
    Character c4 = 'Ϩ';
    System.out.println(c1 == c2); // true, same address
    System.out.println(c3== c4); // false

    Integer i7 = Integer.valueOf(127); //127
    Integer i8 = 127;
    System.out.println(i7 == i8); //true

    Integer i9 = Integer.valueOf(128); //128
    Integer i10 = 128;
    System.out.println(i9 == i10); //false
  }
}
