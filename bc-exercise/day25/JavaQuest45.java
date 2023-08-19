/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * 
 * Note that after backspacing an empty text, the text will continue empty.
 */

import java.util.ArrayDeque;

public class JavaQuest45 {
  public static void main(String[] args) {
    System.out.println(backspaceCompare("ab#c", "ad#c"));
    System.out.println(backspaceCompare("ab##", "c#d#"));
    System.out.println(backspaceCompare("a#c", "b"));

  }

  // Approach 1
  public static boolean backspaceCompare(String s, String t) {
    return afterBackSpace(s).equals(afterBackSpace(t));
  }

  public static String afterBackSpace(String s) {
    ArrayDeque<String> deque = new ArrayDeque<>();
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '#') {
        deque.removeLast();
        continue;
      }
      deque.add(s.substring(i, i + 1));
    }
    StringBuilder sb = new StringBuilder();
    for (String str : deque)
      sb.append(str);
    return sb.toString();
  }

}
