/*
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * 
 * return the number of negative numbers in grid.
 * 
 * Example 1: Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]] Output: 8 Explanation: There are 8 negatives number in the matrix.
 * 
 * Example 2: Input: grid = [[3,2],[1,0]] Output: 0
 * 
 * 
 * Constraints:
 * 
 * m == grid.length n == grid[i].length 1 <= m, n <= 100 -100 <= grid[i][j] <= 100
 */
public class JavaQuest49 {
  public static void main(String[] args) {
    System.out.println(countNegatives(new int[][] {{4, 3, 2, -1}, {3, 2, 1, -1},
        {1, 1, -1, -2}, {-1, -1, -2, -3}}));// Output:
                                            // 8

    System.out.println(countNegatives(new int[][] {{3, 2}, {1, 0}}));// Output : 0
    System.out
        .println(countNegatives(new int[][] {{-100, -99, -88}, {-1, 100, 99}}));// Output : 4
  }

  public static int countNegatives(int[][] grid) {
    // int count = 0;
    // for (int[] col : grid) {
    // for (int element : col)
    // if (element < 0)
    // count++;
    // }
    // return count;
    // }
    int colLen = grid.length, rowLen = grid[0].length;
    int count = 0;
    for (int i = 0; i < colLen; i++) {
      int low = 0, high = rowLen - 1;
      while (low <= high) {
        int mid = low + (high - low) / 2;
        if (grid[i][mid] < 0) {
          high = mid - 1;
        } else
          low = mid + 1;
      }
      count += (rowLen - 1 - high);
    }
    return count;
  }
}


