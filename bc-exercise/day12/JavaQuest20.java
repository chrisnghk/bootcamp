/*
 * Question : Given two strings s and goal, return true if and only if s can become goal after N shifts on s.
 * 
 * Definition of a shift: Moving the leftmost character of s to the rightmost position.
 * 
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * 
 * Assume the input need to be lowercase English letters.
 */
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {
    char[] arr = s.toCharArray();
    char firstChar;
    for (int j = 0; j < s.length(); j++) {
      if (String.valueOf(arr).equals(goal))
        return true;  
      firstChar = arr[0];
      for (int i = 0; i < arr.length - 1; i++) {
        arr[i] = arr[i + 1];
        if (i == arr.length - 2)
          arr[arr.length - 1] = firstChar;
      }
    }
    return false;
  }
}
