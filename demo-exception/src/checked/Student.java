package checked;

public class Student {

  String name;
  long pocketMoney;

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

  public void setPocketMoney(long pocketMoney) throws AmountZeroException {
    if (pocketMoney <= 0)
      throw new AmountZeroException("Amount = 0");
    this.pocketMoney = pocketMoney;
  }

  public static void main(String[] args) {
    Student student = new Student("John");
    try {
      // checked exception
      // int i = 10 / 0;
      student.setName("Peter"); // if exception, throw it to the caller
      student.setPocketMoney(-3);
    } catch (NameTooLongException | AmountZeroException e) {
      // catch (NameTooLongException e) {
      System.out.println("Student Setter Issue, message: " + e.getMessage());
      // System.out.println("Name too Long > 10");
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    } finally {
      System.out.println("finnaly"); // Must Run
    }

    Student student2 = new Student();
    // student2.name.length(); // null pointer,unchecked exception


  }
}
