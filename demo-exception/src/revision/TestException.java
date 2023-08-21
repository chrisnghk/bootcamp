

public class TestException {

  public static int method(int amount) throws BusinessException {
    if (amount >= 0)
      return amount * 100;
    throw new BusinessException("amount < 0");
  }

  public static int method2(int amount) throws AbcException {
    if (amount >= 0)
      return amount * 100;
    throw new AbcException();
  }


  // Approach 2: // RuntimeException // unchecked exception
  public static void main(String[] args) throws BusinessException {
    // Exeoption // check exception
    // Approach 1: handled by try & catch
    try {
      int result = method(-2); // one hit error , cannot proceed 
    } catch (BusinessException e | ) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("final code block");
    }


    // RuntimeException // unchecked exception
    int a = 10;
    if (a >= 0) {
      int result2 = method2(a); // Don't need to handle Runtime exceoption
    }
  }
}
