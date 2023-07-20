import java.util.Arrays;

public class WhileLoop {
  public static void main(String[] args) {
    // while
    int count = 0;
    while (count < 5) {
      count++;
      System.out.println("count = " + count);
    }
    // count = 5

    boolean isHoliday = false;
    int counter = 0;
    while (!isHoliday) { // Is not Holiday
      counter++;
      if (counter >= 6) {
        counter++;
      } else {
        isHoliday = true;
      }
    }
    int c = 0;
    while (c >= 0 && c < 5) {
      System.out.println(c);
      c++;
    }

    int a = 0, b = 10;
    while (a < 5 || b > 0) {
      System.out.println("hello");
      a++;
      b--;
    }

    int k = 0;
    while (k < 6) {
      System.out.println("break: hello");
      k++;
      if (k > 3) {
        break;
      }
    }

    // continue
    int j = 0;
    while (j < 6) {
      j++;
      if (j > 3) {
        continue;
      }
      System.out.println("continue: hello");
    }

    String s2 = "Hello world ! I am Vincent";
    // String[] strings = s2.split(" ");// Use " " to split the String
    // for (String s : strings){
    // System.out.println(s);
    // }
    // without using split, use a for loop to split s2
    // 1. substring()

    System.out.println();
    System.out.println();
    System.out.println();

    int startIdx = 0;
    int counter1 = 0;
    int counter2 = 0;

    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        counter1++;
      }
    }
    String[] str2 = new String[counter1 + 1];
    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        str2[counter2] = s2.substring(startIdx, i);
        startIdx = i + 1;
        counter2++;;
      }else if (i == s2.length() - 1) {
        str2[counter2] = (s2.substring(startIdx, i + 1));
      }

    }
    System.out.println(Arrays.toString(str2));

    System.out.println();
    System.out.println();
    System.out.println();


    // 2. charArray()

    s2 = "Hello world ! I am Vincent";

    String temp = "";
    int counter3 = 0;
    int counter4 = 0;

    for (int i = 0; i < s2.length(); i++) {
      if (s2.charAt(i) == ' ') {
        counter3++;
      }
    }
    String[] str3 = new String[counter3 + 1];
    char[] c2 = new char[s2.length()];
    c2 = s2.toCharArray();
    for (int i = 0; i < c2.length; i++) {
      if (c2[i] != ' ' && i != c2.length - 1) {

        temp += c2[i];
      } else if (c2[i] == ' ') {
        str3[counter4] = temp;
        counter4++;
        temp = "";
      } else {
        temp += c2[i];
        str3[counter4] = temp;
      }
    }
    System.out.println(Arrays.toString(str3));
  }


}

