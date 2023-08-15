package box;

import java.util.ArrayList;

public class Box<T extends Number> {

  private ArrayList<T> numbers;

  public Box() {
    numbers = new ArrayList<>();
  }

  public Box(T number) {
    this(); // the empty constructor of Class Box
    numbers.add(number);
  }

  public ArrayList<T> getNumbers() {
    return this.numbers;
  }

  public void add(T number) {
    numbers.add(number); // null pointer
  }

  public int size() {
    return numbers.size();
  }

  // public void setNumbers(T[] numbers) {
  // this.numbers = numbers;
  // }

  public static void main(String[] args) {
    // Box<String> box1 = new Box<>();
    Box<Integer> box1 = new Box<>(); // compile -time check
    System.out.println(box1.size()); // 1

    // box1 = new Box<>("abc"); // new Box<>("abc") is not Box<number>
    



  }
}
