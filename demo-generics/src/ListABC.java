import java.util.ArrayList;

public class ListABC<T extends Number> {
  ArrayList<T> data;

  public boolean add(T data) {
    return false;
  }

  public static <S> String add(S data) {
    return "";
  }
}
