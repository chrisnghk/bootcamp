public class String2 {
  public static void main(String[] args) {
    // method signature = method name + parameter type & quantity

    // trim(), remove leading space and trail space

    String str = "hello  ";
    String str2 = "   he   lo  ";
    System.out.println("str.trim()=" + str.trim());
    System.out.println("str2.trim()=" + str2.trim());

    // startsWith(), check if the string start with the target string
    if (str.startsWith("hel")) {
      System.out.println("The string starts with hel");
    }

    // endsWith(), check if the string ends with the target string
    boolean endsWithSpace = str.endsWith(" ");
    if (endsWithSpace) {
      System.out.println("The string ends with space");
    }

    // indexOf(int) or indexOf(char)
    System.out.println("The index of o in str = " + str.indexOf('o'));// 4
    // indexOf(String)
    System.out.println("The index of ll in str = " + str.indexOf("ll"));// 2
    System.out.println("The index of lll in str = " + str.indexOf("lll")); // -1
    System.out.println(
        "The index of o in str,search from index 5 = " + str.indexOf('o', 5)); // -1
    System.out.println(
        "The index of ll in str,search from index 3 = " + str.indexOf("ll", 3)); // -1

    // last index of
    String str3 = "hello";

    System.out.println("The index of l in str = " + str3.lastIndexOf('l')); // 3
    System.out.println("The index of ll in str = " + str3.lastIndexOf("ll")); // 2
    System.out.println("The index of l in str = " + str3.lastIndexOf('l', 3)); // 3

    // replace

    String s = "Java is a programming Java language";
    System.out.println(s.replace("Java", "Python"));
    System.out.println(s.replace("p", "q"));

    // equals(),equalsIgnoreCase()
    if ("hello".equals(str3)) { // true
      System.out.println("str3 = hello");
    }
    if ("Hello".equals(str3)) { // false
      System.out.println("str3 = Hello");
    }
    if ("Hello".equalsIgnoreCase(str3)) { // true ,non case sesitive
      System.out.println("non case sesitive checking");
    }
    if ("HELLO".equals(str3.toUpperCase())) { // true
      System.out.println("Alternative");
    }

    // concat(String), append something
    String newString = str3.concat(" Java!"); // + operation
    System.out.println("newString = " + newString); // hello Java!
    str3 = str3.concat(" Java!");
    System.out.println("str3=" + str3); // hello Java!

    // CompareTO
    String apple = "apple", facebook = "facebook";
    System.out.println(apple.compareTo(facebook));// -5, 97 - 102 ('a' - 'f')

  }
}
