import java.util.Arrays;

public class SearchArray {
  public static void main(String[] args) {
    // search

    char target = 'm';
    char[] chars = new char[] {'j', 'p', 'm', 'm', 'q', 'c'};
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        System.out.println("found target in array chars index is " + i);
        break;
      }
    }

    // toCharArray()
    String str = "I am a boy.";// 11 characters
    char[] arr = str.toCharArray();
    System.out.println(Arrays.toString(arr));


    int[] nums = new int[] {24, 800, -23, 6, 98};
    int max = -210000000;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println("The max value of the nums is " + max);

    int min = 210000000;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < min) {
        min = nums[i];
      }
    }
    System.out.println("The min value of the nums is " + min);

  }


  // Find Max. value in the array


}
