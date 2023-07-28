package RosterShift;

public class Staff {

  private int id;
  private String name;
  private String title;
  private int leaveBalance;

  public static int counter;

  public Staff(String name,String title,int leaveBalance){
    this.id = counter + 1;
    this.name = name;
    this.title = title;
    this.leaveBalance = leaveBalance;
    addCounter();
  }

  private static int addCounter(){
    return counter++;
  }

  public int getId(){
    return this.id;
  }

  private void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  private void setTitle(String title) {
    this.title = title;
  }

  private String getTitle() {
    return this.title;
  }

  private void setLeaveBalance(int leaveBalance) {
    this.leaveBalance = leaveBalance;
  }

  private int getLeaveBalance() {
    return this.leaveBalance;
  }



}
