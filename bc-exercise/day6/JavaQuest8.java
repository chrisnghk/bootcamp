/**
 * Example Output Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    // code here
    int[] nums = new int[] {-10, 5, 100, 240, 230, 80}; // Second Max = 230
    int[] nums2 = new int[] {-10, 5, 100, 120, 240, 200}; // Second Max = 200
    int[] nums3 = new int[] {-10, 5, 120, -100, 100, 240}; // Second Max = 120
    int[] nums4 = new int[] {-10, 5, 100, 240, 240, 80}; // Second Max = 240

    // Your program should be able to handle all the above test case.
    int secondMax;
    // code
    int max = -2100000000, temp = 0;
    secondMax = -2100000000;
    for (int i = 0; i < nums.length; i++) {
      if (nums4[i] > max) {
        secondMax = max;
        max = nums4[i];
      }else if ( nums4[i] > secondMax){
        secondMax = nums4[i];
      }
    }
    System.out.println("The max nubmer is " + max);
    System.out.println("The second max nubmer is " + secondMax);
  }
}
