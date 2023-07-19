import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    // [5,1,4,8,2]
    // Step1.1:[1,5,4,8,2]
    // Step1.2:[1,4,5,8,2]
    // Step1.3:[1,4,5,8,2] ( no change, due to 5 < 8)
    // Step1.4:[1,4,5,2,8]
    // Step2.1:[1,4,5,2,8] ( no change, due to 1 < 4)
    // Step2.2:[1,4,5,2,8] ( no change, due to 4 < 5)
    // Step2.3:[1,4,2,5,8]

    // step3

    // target : [1,2,4,5,8]]

    int[] nums = new int[] {5, 1, 4, 8, 2};
    System.out.println(Arrays.toString(sort(nums)));

  }

  public static int[] sort(int[] arr) {
    int temp = 0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
        //System.out.println("Step "+ (i + 1) +"."+(j+1)+ Arrays.toString(arr));
      }
    }
    return arr;
  }
}
