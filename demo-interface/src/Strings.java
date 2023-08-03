public class Strings implements CharSequence {

  char[] arr; // "abc", [a ,b ,c ]

  private Strings(String str) {
    this.arr = new char[str.length()];
    //
    for (int i = 0; i < str.length(); i++) {
      this.arr[i] = str.charAt(i); // string
    }
  }

  public static Strings valueOf(String str) {
    return new Strings(str);
  }

  @Override
  public int length() {
    return this.arr.length;
  }

  @Override
  public char charAt(int idx) {
    return this.arr[idx];
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    if (end < start || start < 0 || end < 0 || start > this.arr.length - 1
        || end > this.arr.length)
      return String.valueOf(this.arr);
    // return String , StringBuilder , StringBuffer
    StringBuilder sb = new StringBuilder();
    for (int i = start; i < end; i++) {
      sb.append(this.arr[i]);
    }
    return sb.toString();
  }



  public static void main(String[] args) {
    // CharSequence -> INterface
    String str = "abc";
    Strings s = Strings.valueOf("abc");
    System.out.println(s.subSequence(1, 3));

  }
}
