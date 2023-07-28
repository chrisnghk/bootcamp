package RosterShift;

import java.time.LocalDate;

public class Template {

  private int row = LocalDate.of(2023, 2, 1).lengthOfMonth(); // Days of month 
  private int column = Staff.counter; // Number of Staff
  private int onDutyRequirement =6 ; // Daily on duty requirement 
  private int stdDayOffThisMonth = 6; // Need day off in this month by each staff 
  private int publicHoilday = 0; // Pulbic hoildday in this month by each staff


}

