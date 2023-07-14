public class Loops2 {
  public static void main(String[] args) {
    // break
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i = " + i + " , j = " + j);
        if (i == j) {
          break; // this break statement just break the inner loop
        }
      }
    }


    System.out.println();
    System.out.println("*******continue *******");
    System.out.println();


    // continue

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == j) {
          continue; // skiip the rest in inner loop, go to next inetation
        }
        System.out.println("i = " + i + " , j = " + j);
      }
    }

    System.out.println();
    System.out.println();
    System.out.println();


    String str = "I love progranning. I love Java.";
    System.out.println("Str length = " + str.length());

    for (int i = 0; i < str.length(); i++) {
      System.out.println("Hello");
    }


    System.out.println();
    System.out.println();
    System.out.println();
    //
    // str.charAt(int index)
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        System.out.println("Index of the first character 'e' is " + i);
        break;
      }
    }

    System.out.println();
    System.out.println();
    System.out.println();

    // for (int i = 0; i < str.length(); i++) {
    // if (str.charAt(i) == 'y') {
    // System.out.println("Found");
    // break;
    // } else if (i == str.length() - 1) {
    // System.out.println("Not found");
    // }
    // }


    boolean isFound = false;
    for (int i = 0; i < str.length(); i++) {
      isFound = str.charAt(i) == 'y' ? true : false;
    }
    System.out.println(isFound ? "Found" : "Not Found");


    System.out.println();
    System.out.println();
    System.out.println();

    // if the number of occurrence of target >= 3,print Yes
    // otherwise
    char target = 'o';
    int count = 0;
    boolean isFound2 = false;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
      }
      if (count >= 3) {
        isFound2 = true;
        break;
      }
    }
    System.out.println(isFound2 ? "Yes" : "No");

    System.out.println();
    System.out.println();
    System.out.println();
  }
}
