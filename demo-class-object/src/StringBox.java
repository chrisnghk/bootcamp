import java.util.Arrays;

public class StringBox {

  private String string; // String -> Class


  // constructor, getter, setter
  public StringBox() {

  }

  public StringBox(String string) {
    this.string = string;
  }

  public char[] toCharArray() {
    char[] arr = new char[this.string.length()];
    for (int i = 0; i < this.string.length(); i++) {
      arr[i] = this.string.charAt(i);
    }
    return arr;
  }

  public void setString(String string) {
    this.string = string;
  }

  public String string() {
    return this.string;
  }

  public StringBox append(String str) { // obj.append()
    if (str == null || "".equals(str)) // important!!! if "" is null, if reference is null, server will be dead
      return this;
    this.string = this.string + str;
    // return this.string;
    return this; // return StringBox object reference
  }


  public static StringBox append(String str, String str2) {
    return new StringBox(str + str2);
  }

  public StringBox insert(String str, int idx) {
    if (idx < 0 && idx > this.string.length())
      return this;
    if (str == null || "".equals(str))
      return this;
    this.string =
        this.string.substring(0, idx) + str + this.string.substring(idx);
    return this;
  }


  public String toString() {
    return this.string;
  }

  public static void main(String[] args) {
    StringBox s = new StringBox(); // empty constructor
    s.setString("Java");
    System.out.println(s.append("Python")); // JavaPython
    s.append("javascript").append("HTML").toString();

    String s3 = StringBox.append("Hello", "world").toString();
    System.out.println(s3);
    char[] result = s3.toCharArray();
    System.out.println(Arrays.toString(result));
  }
}
