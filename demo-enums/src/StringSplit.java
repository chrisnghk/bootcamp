public class StringSplit {

  public static void main(String[] args) {
    String s = "abc def xyz";

    for (String str : s.split(" ")) {
      System.out.println(str);
    }

    for (String str : s.split("\\s")) {
      System.out.println(str);
    }

    String s2 ="abc     def  xyz  pld";
    for (String str : s2.split("\\s+")) { // \s means space 
      System.out.println(str);
    }
  }

}
