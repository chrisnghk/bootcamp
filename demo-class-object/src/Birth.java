import java.time.LocalDate;
import java.time.Month;

public class Birth {
  public static void main(String[] args) {
    LocalDate today = LocalDate.now();
    System.out.printf("%s\n", today); // 2023-07-28
    LocalDate specifiedDate = LocalDate.of(2023, Month.FEBRUARY, 22);
    System.out.printf("%s\n", specifiedDate);

    LocalDate d1 = LocalDate.parse("2023-12-30");
    System.out.printf("%s\n", d1.getYear());
    System.out.printf("%s\n", d1.getMonth());
    Month result = d1.getMonth();
    System.out.printf("%s\n", result.getValue());
    System.out.printf("%s\n", d1.getDayOfMonth());
    System.out.printf("%s\n", d1.getDayOfWeek());

    System.out.println(LocalDate.parse("2023-07-28").getDayOfWeek()); // Friday
    System.out.println(LocalDate.parse("2023-07-28").getDayOfYear()); // 209

    System.out.printf("%s\n", d1.plusMonths(1L)); // 2023-12-30 + 1 month = 2024-1-30

    // plusDays
    // plusYears
    boolean expiry = false;
    LocalDate effectiveDate = LocalDate.of(2023, 7, 20);
    if (LocalDate.now().isAfter(effectiveDate.plusMonths(3L))) {
      expiry = true;
    }
  }
}
