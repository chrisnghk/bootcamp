import java.util.HashMap;

/*
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * 
 * 
 * 
 * Example 1: Input: s = "leetcode" Output: 0
 * 
 * Example 2: Input: s = "loveleetcode" Output: 2
 * 
 * Example 3: Input: s = "aabb" Output: -1
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 105 s consists of only lowercase English letters
 */

public class JavaQuest47 {
  public static void main(String[] args) {
    System.out.println(firstUniqChar("leetcode"));// 0
    System.out.println(firstUniqChar("loveleetcode"));// 2
    System.out.println(firstUniqChar("aabb"));// -1
  }

  public static int firstUniqChar(String s) {
    HashMap<Character, Integer> hm = new HashMap<>();
    char ch;
    int len = s.length();
    for (int i = 0; i < len; i++) {
      ch = s.charAt(i);
      if (hm.containsKey(ch)) {
        hm.put(ch, hm.get(ch) + 1);
        continue;
      }
      hm.put(ch, 1);
    }
    for (int i = 0; i < len; i++) {
      ch = s.charAt(i);
      if (hm.containsKey(ch) && hm.get(ch) == 1)
        return i;
    }
    return -1;
  }
}
