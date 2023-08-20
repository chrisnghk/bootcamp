/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. Open brackets must be closed in the correct order. Every close bracket has a corresponding open bracket of the same type.
 * 
 * 
 * Example 1: Input: s = "()" Output: true
 * 
 * Example 2: Input: s = "()[]{}" Output: true
 * 
 * Example 3: Input: s = "(]" Output: false
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class JavaQuest48 {
  public static void main(String[] args) {
    System.out.println(isValid("()")); // true
    System.out.println(isValid("()[]{}"));// true
    System.out.println(isValid("(]"));// false
    System.out.println(isValid("([{}]){[]}"));// true

  }

  public static boolean isValid(String s) {
    Stack<Character> st = new Stack<>();
    Map<Character, Character> brackets = Map.of(')', '(', ']', '[', '}', '{');

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (isOpenBracket(ch)) {
        st.push(ch);
        continue;
      }
      if (isCloseBracket(ch) && st.size() == 0 || st.peek() != brackets.get(ch))
        return false;
      if (isCloseBracket(ch))
        st.pop();
    }
    return (st.size() != 0) ? false : true;
  }

  public static boolean isOpenBracket(char ch) {
    switch (ch) {
      case '(', '[', '{' -> {
        return true;
      }
    }
    return false;
  }

  public static boolean isCloseBracket(char ch) {
    switch (ch) {
      case ')', ']', '}' -> {
        return true;
      }
    }
    return false;
  }
}
