import java.util.Arrays;

public class JavaQuest14 {
  // Given an integer x, return true if x is a palindrome (迴文), and false otherwise.
  // Palindrome: it is same text, no matter you read it from left to right, or from right to left

  // Case 1: 13431
  // true

  // Case 2: -123
  // false

  // Case 3: 1
  // true

  // Case 4: 22
  // true

  // Case 5: 1231
  // false

  // Do not change anything in main method
  public static void main(String[] args) {
    boolean res = palindrome(13431); // true
    boolean res2 = palindrome(-121); // false
    boolean res3 = palindrome(1); // true
    boolean res4 = palindrome(22); // true
    boolean res5 = palindrome(1231); // false

    System.out.println("res result is " + res);
    System.out.println("res2 result is " + res2);
    System.out.println("res3 result is " + res3);
    System.out.println("res4 result is " + res4);
    System.out.println("res5 result is " + res5);
  }

  // Code a method here to return true if the integer is palindrome, otherwise false
  public static boolean palindrome(int sourceNumber) {
    if (sourceNumber > 0) { 
      char[] arr = new char[String.valueOf(sourceNumber).length()]; // create new array 
      for (int i = 0; i < arr.length; i++) {
        arr[i] = String.valueOf(sourceNumber).charAt(i);  // convert each digit to char array 
      }
      for (int i = 0; i < (arr.length + 1) / 2 + (arr.length + 1) % 2; i++) { // for loop run round up the length /2 
        if (arr[i] != arr[arr.length - 1 - i]) {  
          return false;
        }
      }
      return true;
    } else {
      return false;
    }
  }
}
