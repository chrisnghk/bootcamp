// import java.util.Arrays;

public class Swap {
  public static void main(String[] args) {
    int[] arr = new int[] {100, -400, 3, 99};
    // code here .... to swap 100 and 99
    int temp = arr[0];
    arr[0] = arr[3];
    arr[3] = temp;
    // int temp = 0;
    // for (int j = 0; j < arr.length; j++) {
    // if (j < arr.length / 2) {
    // temp = arr[j];
    // arr[j] = arr[arr.length - j];
    // }
    // }

    for (int i = 0; i < arr.length; i++) {
      // print all elements
      System.out.println(arr[i]);
    }

    System.out.println(SwapOddEvenCharacter("abcd"));
  }

  // Swap

  public static String SwapOddEvenCharacter(String str) {
    // hello! -> ehll!o
    // abcd -> badc
    // aabb -> aabb
    // abcdef -> badcfe
    // abc -> bac
    // c -> c


    // char[] str2 = str.toCharArray();
    // char temp2;
    // String sum = "";
    // if (str2.length % 2 == 0) {
    // for (int i = 0; i < str2.length; i = i + 2) {
    // temp2 = str2[i];
    // str2[i] = str2[i + 1];
    // str2[i + 1] = temp2;
    // sum += "" + str2[i] + str2[i + 1];
    // }
    // return sum;
    // } else {
    // for (int i = 0; i < str2.length; i = i + 2) {
    // if (i +1 == str2.length) {
    // sum += "" + str2[str2.length - 1];
    // } else {
    // temp2 = str2[i];
    // str2[i] = str2[i + 1];
    // str2[i + 1] = temp2;
    // sum += "" + str2[i] + str2[i + 1];
    // }
    // }
    // return sum;

    char[] chars = str.toCharArray();
    char temp3;
    for (int i = 0; i < chars.length-1; i++) {
      if (i % 2 == 0) {
        temp3 = chars[i];
        chars[i] = chars[i + 1];
        chars[i + 1] = temp3;
      }
    }
    return String.valueOf(chars);
  }
}