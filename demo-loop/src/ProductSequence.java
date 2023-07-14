public class ProductSequence {
  public static void main(String[] args) {
    int second = 0;
    int count = 0;
    int last = 20;
    for (int i = 0; i < 10000; i++) {
      if (second != i){System.out.print(i * second + ", ");
      second = i;
      count++;
    }
      if (count >= last ) {
        break;
      }
    }
  }
}
