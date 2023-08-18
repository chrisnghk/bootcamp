import java.util.LinkedList;

public class RememberMe {
  public static void main(String[] args) {
    LinkedList<String> strings = new LinkedList<>();
    for (int i = 0; i < 4; i++) {
      if (i % 2 > 0) {
        strings.addLast("N");
      } else {
        strings.addLast("C");
      }
    }

    strings.addFirst("V");
    strings.add("T");
    strings.add(4, "E");
    strings.set(2, "I");
    System.out.println(strings);
  }
}
