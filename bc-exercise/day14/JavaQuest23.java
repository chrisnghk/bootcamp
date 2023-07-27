/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    int count1 = 0,count2 =0;
    for (int i =0;i < s.length();i++){
      if( s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'|| s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O'  ){
        if ( i < s.length()/2){
          count1++;
        }else{
          count2++;
        }
      }
    }
    return count1==count2;
  }
}