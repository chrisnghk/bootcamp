import java.util.Arrays;

public class Array3 {

  public static void addOne(int[] arr) { // Pass by reference
    for (int i = 0; i < arr.length; i++) {
      arr[i] = arr[i] + 1;
    }
  }

  // All Wrapper Class + String -> Pass by Value
  public static String concat(String s1, String s2) { // pass by value
    s1 ="hello";
    return s1 + s2;
  }

  public static void main(String[] args) {
    int[] nums = new int[] {3, 4, 8};
    addOne(nums); // [4,5,9]

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

      // CAll concat
  String a = "abc";
  String b ="def";

  String result = concat(a, b);
  System.out.println(result);
  System.out.println(a);
    
  }


}
