package RosterShift;

import java.time.LocalDate;

public class demo {

  public static void main(String[] args) {
    Staff s1 = new Staff("Chris Ng", "IT", 8);
    Staff s2 = new Staff("Testing", "Admin", 8);


    System.out.println(s1.getName() + " " + s1.getId());
    System.out.println(s2.getName() + " " + s2.getId());
    System.out.println(Staff.counter);
    Staff[] staffs = new Staff[Staff.counter];
    
    StringBuilder sb = new StringBuilder("testing");
  }
}
