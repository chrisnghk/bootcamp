/*
 * Sum up to Zero
 */

// Input: n = 5
// Output: [-7,-1,1,3,4]
// Explanation: These arrays are also accepted [-5,-1,1,2,3], [-3,-1,2,-2,4].

// Input: n = 3
// Output: [-1, 1, 0] or [-3, 1, 2] or ...

// Input: n = 2
// Output: [-2, 2] or [-1, 1] or ...

// Input: n = 1
// Output: [0]

import java.util.Arrays;
import java.util.Random;

public class JavaQuest16 {
  // Given an integer n (n > 0), Find n unique Integers Sum up to Zero

  // Do not change anything in main method
  public static void main(String[] args) {
    int[] nums = sumToZero(5); // n = 5
    int[] nums1 = sumToZero(3); // n = 3
    int[] nums2 = sumToZero(2); // n = 2
    int[] nums3 = sumToZero(1); // n = 1
  }

  // Code a method to return int[].
  // 1. All values in this array sum up to Zero.
  // 2. The length of array = n
  // 3. The values in the array has to be unique

  // public static int[] uniqueArr(int length){
  //   int[] arr = new int[length];
  //   for (int i=0;i<arr.length;i++){
  //     int RanNum = new Random().nextInt(-9,9);
  //     while (RanNum != arr[i]){
  //     arr[i] = RanNum;
  //     }
  //   }

  // }

  public static int[] sumToZero(int input) {
    boolean isDuplicated;
    boolean nZero = true;
    int[] arr = new int[input];
    int Nums, sum;
    do {
      for (int i = 0; i < arr.length; i++) {
        Nums = new Random().nextInt(-9, 9);
        arr[i] = Nums;
      }
      isDuplicated = true;
      for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
          if (arr[i] != arr[j]) {
            isDuplicated = false;
          }
        }
      }

      sum = 0;
      nZero = true;
      for (int x : arr) {
        sum += x;
      }
      if (sum == 0) {
        nZero = false;
      }
      if (input == 1) {
        arr[0] = 0;
        isDuplicated = false;
        nZero = false;
      }
    } while (isDuplicated || nZero);


    System.out.println(Arrays.toString(arr));

    return arr;
  }

}
