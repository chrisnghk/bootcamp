import java.util.Scanner;

public class Array2 {
  public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.print("please input the string for swap : ");
    String str = input.nextLine();
    System.out.println(swap(str, 0, 3));
  }

  public static String swap(String str, int idx1, int idx2) {

    if (str == null) {
      return null;
    }
    if (str.isBlank()) {
      return str;
    }

    if (idx1 < 0 || idx1 >= str.length()) {
      return str;
    }
    if (idx2 < 0 || idx2 >= str.length()) {
      return str;
    }

    char[] arr = new char[str.length()];
    arr = str.toCharArray();
    char temp = arr[idx1];
    arr[idx1] = arr[idx2];
    arr[idx2] = temp;

    return String.valueOf(arr);
  }
}
