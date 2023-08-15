package printer;
public class Printer<T> { // 1. Class Signature, add<>, T represent any Class

  T value;
  T[] numbers;
  Object object;

  public T getValue() {
    return this.value;
  }

  public void setvalue(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(this.value);
  }

  public Object getObject() {
    return this.object;
  }

  public void setObject(Object object) {
    this.object = object;
  }


  public static void main(String[] args) {
    Printer<String> p1 = new Printer<>();
    // Strong Type checking -> check if you put a real class into <>
    p1.setvalue("abc");
    System.out.println(p1.getValue());

    Printer<Integer> p2 = new Printer<>();
    p2.setvalue(100);
    System.out.println(p2.getValue());

    Printer<Boolean> p3 = new Printer<>(); 
    p3.setObject("String");
    System.out.println(((String) p3.getObject()).charAt(0));

    Printer p4 = new Printer();
    p4.setvalue("100");
    System.out.println(p4.getValue());

  }

}
