import java.util.Arrays;

public class InsertionSort {
  public static void main(String[] args) {
    // [5,1,4,8,2]
    // Step 1.1 [1,5,4,8,2] ( insert 1 tp arr[0],1<5)
    // After round 1,[1,5] is sorted
    // step2.1: Compare 4<5
    // step2.2: Compare 1<4 ->[1,4,5]
    // After round 2,[1,4,5] is sorted

    int[] nums = new int[] {5, 1, 4, 8, 2};
    System.out.println(Arrays.toString(insertS(nums)));


  }

  public static int[] insertS(int[] arr) {
    int temp;
    for (int i = 0; i < arr.length; i++) {  // start the sequence " left to right"
      for (int j = i; j >= 0; j--) { // start the sequence " right to left " and start from outer loop number 
        if (i != j) {
          if (arr[i] < arr[j]) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i = j; // amend to number for compare on next loop
          } 
        }
      }
    }
    return arr;
  }
}
