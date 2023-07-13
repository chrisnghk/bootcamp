public class test {
  public static void main(String[] args) {
    {
      String testcase = "Susan";
      String result = " ";
      switch (testcase) {
        case "abba":
          result = "abba";
          break;
        case "bbbb":
          result = "bbbb";
          break;
        case "Susan":
          result = "Susan";
          break;
        case "John":
          result ="John";
          break;
        default :
          result ="404 Not found";
      }
      System.out.println("The result is " + result);
    }

  }
}

