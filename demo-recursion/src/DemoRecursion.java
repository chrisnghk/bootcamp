public class DemoRecursion {

  public static void main(String[] args) {
    // algorithm -> algo
    System.out.println(sum(5)); // 15
    System.out.println(sum2(8));
    print(3);
  }

  // Question 1:
  // k + ( k-1 ) + (k -2 ) + ....+ 0
  public static int sum(int k) {
    if (k < 1) // base condition
      return k;
    return k + sum(k - 1);
    // 15 , No return
    // 5 + 10,No return
    // 4 + 6 ,No return
    // 3 + 3 ,No return
    // 2 + 1 ,No return
    // 1 + 0 ,No reutrn
    // 0 < 1, reutrn
  }

  // Question 2
  // 0, 1, 2, 3, 5, 8 ,13 .. kth elements [0,1,2,3 ...]
  // k =6, return
  public static int sum2(int k) {
    // base condition
    if (k <= 1)
      return k;
    return sum2(k - 1) + sum2(k - 2);
  }

  // Question 3
  // non tail recursion
  // 3 2 1 1 2 3 , k = 3
  public static void print(int k) {
    // base condition
    if (k < 1) 
        return;
    System.out.print(k + " ");
    print(k - 1);
    System.out.print(k + " ");
  }
}
