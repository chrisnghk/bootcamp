package checked;

public class Student {

  String name;

  Student() {

  }

  public Student(String name) {
    this.name = name;
  }

  public void setName(String name) throws NameTooLongException {
    if (name.length() > 10)
      throw new NameTooLongException("Name is too long (>50)");
    this.name = name;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      student.setName("Peterfasfsfa asfsdf"); // if exceptino, throw it to the caller
    } catch (NameTooLongException e) {
      System.out.println("Northing happen");
    }

    Student student2 = new Student();
    // student2.name.length(); // null pointer,unchecked exception


  }
}
