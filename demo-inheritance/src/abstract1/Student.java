public class Student extends Adult {

  public Student(){
    super(); // new Adult();
  }

  public void sleep() {
    System.out.println("I am student,sleeping");
  }

  public void read() {
    System.out.println("I am student, reading");
  }

  @Override
  public void run(){
    System.out.println("I am Student, runing ");
  }

  public static void main(String[] args){
    Student student = new Student();
    student.sleep();
    student.read();
    student.run();
    student.eat();
    System.out.println(student.getAge());//0
  }


}
