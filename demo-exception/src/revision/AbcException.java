public class AbcException extends RuntimeException {
  // / by Zero
  // null pointer
  // array size
  // concurrentModification

  public AbcException() {
    super("abc exceoption");
  }

  public static void main(String[] args) {
    int a = 10 / 0;
  }
}
