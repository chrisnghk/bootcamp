public class Conditionals {
  public static void main(String[] args) {
    // if, else if, else

    // if
    int i = 10;
    if (i > 9) {
      System.out.println("i = " + i);
    }
    // if-else
    if (i < 8) {
      System.out.println("i is smaller than 8.");
    } else {
      System.out.println("i is larger than or equals to 8");
    }
    // else if
    if (i > 12) {
      System.out.println("i > 12");
    } else if (i <= 12 && i >= 0) {
      System.out.println("i <= 12 and i >= 0");
    } else {
      System.out.println("i is netative.");
    }


    int a = 2, b = 5, box = 0;
    if (a > b) {
      box = 10;
    } else {
      box = 19;
    }

    int number = 11;
    if (number % 2 == 1) {
      System.out.println("number is an odd number");
    } else {
      System.out.println("number is even number");
    }
    // String
    String str = "Mondays";
    if (str.equals("Monday")) {
      System.out.println("str = Monday");
    }
    if (str.charAt(4) == 'd') {
      System.out.println("yes");
    }
    if (str.length() > 10) {
      System.out.println("length > 10");
    }

    int score = 89;
    char grade = ' ';
    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else if (score >= 60) {
      grade = 'D';
    }

    int age = 65;
    boolean isElderly = age >= 65;

    if (isElderly) {
      System.out.println("yes he is elderly");
    }
  
  // switch
  //Simple Versoin 
  int dayOfWeek = 3;
  String dayName = "";
  switch (dayOfWeek){
    case 1:
    dayName = "Monday";
    break; // exit
    case 2:
    dayName = "Tuesday";
    break; // exit
    case 3:
    dayName = "Wednesday";
    break; // exit
    case 4:
    dayName = "Thursday";
    break; // exit
    case 5:
    dayName = "Friday";
    break; // exit
    case 6:
    dayName = "Saturday";
    break; // exit
    case 7: 
    dayName= "Sunday";
    break; // exit
  }
  System.out.println("Today is " + dayName);
  // default 


  }

}

