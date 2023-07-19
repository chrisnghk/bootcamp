import java.util.Arrays;

public class Swap2 {
  public static void main(String[] args) {
    int[] nums = new int[] {8, 3, -10, 30, 100, -19};
    // Move the max number to the tail { 8,3,-10,30,-19,100}
    // int temp = 0;
    // int max = -21000;
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] > max) {
    // max = nums[i];
    // }

    // }
    // for (int j = 0; j < nums.length; j++) {
    // if (max == nums[j]) {
    // temp = nums[nums.length-1];
    // nums[nums.length-1] = nums[j];
    // nums[j] = temp;
    // }
    // }


    int indexMax = 0;
    int temp = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > nums[indexMax]) {
        System.out.println("nums i is " + nums[i] + "index max is "+ indexMax);
        indexMax = i;
      }
    }
    temp = nums[nums.length - 1];
    nums[nums.length - 1] = nums[indexMax];
    nums[indexMax] = temp;

    System.out.println(Arrays.toString(nums));

    int[] testing = new int[] {2, 3, 0};

    System.out.println(average(testing));
  }

  public static double average(int[] arr) {
    // calculate the average of all number in arr.
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return (double) sum / arr.length;
  }

}
