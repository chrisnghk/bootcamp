public class ReverseString {
  public static void main(String[] args) {
    String str = "hello";
    // olleh
    for (int i = str.length() - 1; 0 < i; i--) {
      System.out.print(str.charAt(i));
    }
    System.out.println();
  }

}
