// Question 8
import java.util.ArrayList;
import java.util.List;

class Password {
  private String password;

  Password(String x) {
    this.password = x;
  }
}


class PasswordHub {
  public static void main(String[] args) {
    int counter = 0;
    Password pl = new Password("ABC");
    Password p2 = new Password("BCD");
    List<Password> passwords = new ArrayList<>();
    for (Password password : passwords) {
      for (int i = 0; i < 2; i++) {
        counter++;
      }
    }

    System.out.println(counter);
  }
}
