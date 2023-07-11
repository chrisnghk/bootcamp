public class String1 {
  public static void main(String[] args){
    String str = "I am happy, but raining";
    str = str +".";
    System.out.println(str);

    // Method
    int i = str.length();
    System.out.println(i);

    String str1 = "abc";
    String str2 = "abcd";
    String str3 = "abc";
    boolean areTheyEqual = str1.equals(str2);
    boolean areTheyEqual2 = str1.equals(str3);
    System.out.println(areTheyEqual);
    System.out.println(areTheyEqual2);
    boolean b4 = str2.equals(str1 + "d");
    System.out.println(b4);

    //chart(2), find the char at index 2 of the string
    String str4 = "helloworld";
    System.out.println(str4.charAt(2));
  }
}
