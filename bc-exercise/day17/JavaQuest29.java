/*
 * Question : Given an integer n, add a dollar sign ("$") and a comma (",") as the thousands separator and return it in string format.
 */
/*
 * Constraints:
 * 
 * 0 <= n <= 231 - 1
 */
public class JavaQuest29 {
  public static void main(String[] args) {
    System.out.println(separator(85));// $85
    System.out.println(separator(0));// $0
    System.out.println(separator(1000));// $1,000
    System.out.println(separator(123987405));// $123,987,405

  }

  public static String separator(int n) {
    // code here
    int x = 0,counter =0;
    StringBuilder sb = new StringBuilder(String.valueOf(n));
    if (sb.length() / 3 > 0 && sb.length() % 3 > 0) {
      x = sb.length() / 3;
    } else if ( sb.length() / 3 > 0 && sb.length() % 3 == 0) { 
      x = (sb.length() / 3) -1;
    } else if  (sb.length() % 3 == 0){
      x = 0;
    }
    for (int i = 1; i <= x; i++) {
       sb.insert(sb.length() - (i * 3)-counter, ",");
       counter++;
     }
     String.valueOf(sb.toString());
    return sb.insert(0,"$").toString();
  }

}
