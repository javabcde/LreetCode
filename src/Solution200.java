/**
 * Created by TOM
 * On 2020/2/23 15:49
 */
public class Solution200 {

  public static void main(String[] args) {
    int[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
    int m = grid.length;
    int n = grid[0].length;
    for (int i = 0; i < m; ++i) {
      for (int j = 0; j < n; ++j) {
        if (grid[i][j] == 1) {
          System.out.println(i * n + j);
        }
      }
    }
  }

  public int numIslands(char[][] grid) {

    return 0;

  }

  class unionClass {

    private int size;
    private int[] parents;
    private int[] weight;

    public unionClass(int[][] grid) {
      int cow = grid.length;
      int col = grid[0].length;
      for (int i = 0; i < cow; i++) {
        for (int j = 0; j < col; j++) {

        }
      }
    }
  }
}
