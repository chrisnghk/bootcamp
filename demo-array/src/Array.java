import java.util.Arrays;

public class Array {
  public static void main(String[] args) {
    int num = 7;
    int num2 = 8;
    int num3 = -30;

    // Create Empty Array ( Approach 1 )
    int[] nums = new int[3];// 3 is the length of array nums
    // with index 0,1,2
    nums[0] = -40;
    nums[1] = 500;
    nums[2] = -1000;

    // double[]

    double[] dnums = new double[6];
    dnums[0] = 4;
    dnums[1] = 5.1;
    dnums[2] = 0.0;

    for (int i = 0; i < nums.length; i++) {
      System.out.println("nums [" + i + "] " + nums[i]);
    }

    // reversely print array nums
    for (int i = dnums.length-1; i > 0; i--) {
      System.out.println("dnums [" + i + "] " + dnums[i]);
    }

    // Approach 2,create Array
    int[] array = new int[] {3,9,12};
    for (int i = 0;i < array.length;i++){
      System.out.println("arra[" + i + "]="+array[i]);
    }

    // Can add a new element ar tail? No


    // char[]
    char[] chars = new char[3];
    chars[2] = 'a';
    chars[0] = '!';
    for (int i = 0;i < chars.length;i++){
      System.out.println("chars["+i+"]="+chars[i]);
    }

    // boolean
    boolean[] arr2 = new boolean[2];
    arr2[0] = true;
    for (int i =0;i < arr2.length; ++i){
      System.out.println("arr2[" +i+"]"+arr2[i]);
    }

    // String 
    String[] strs = new String[] {"hello","abc","goodbye"};
    strs[1] = "typhoon";
    for ( int i =0;i< strs.length;i++){
      System.out.println("strs ["+ i +"]"+strs[i]);
    }

    String[] fruits= new String[5];
    fruits[0] = "apple";
    fruits[1] = "watermelon";
    fruits[2] = "orange";

    System.out.println(Arrays.toString(fruits));

    byte[] bytes = new byte[6];
    bytes[3]= -4;
    System.out.println(Arrays.toString(bytes));
  }
}
