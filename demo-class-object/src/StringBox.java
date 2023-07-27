public class StringBox {

  private String string; // String -> Class


  // constructor, getter, setter
  public StringBox() {

  }

  public StringBox(String string) {

  }

  public void setString(String string) {
    this.string = string;
  }

  public String string() {
    return this.string;
  }

  public StringBox append(String str) {
    if (str == null || "".equals(str))
      return this;
    this.string = this.string + str;
    return this;
  }

  public StringBox append(String str1, String str2){

    this.string = str1 +" "+ str2;
    return this;
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
    System.out.println(s.insert("testing", 5).toString());

    //String s3 = StringBox.append("Hello", "world").toString();

  }
}
