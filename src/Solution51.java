import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by TOM
 * On 2021/9/21 23:06
 */
public class Solution51 {

  public static List<List<String>> solveNQueens(int n) {
    List<List<String>> result = new ArrayList<>();

    char[][] initTable = new char[n][n];
    for (char[] chars : initTable) {
      Arrays.fill(chars, '.');
    }
    backTrack(n, 0, initTable, result);
    return result;
  }

  private static void backTrack(int n, int row, char[][] initTable, List<List<String>> result) {
    if (n == row) {
      List<String> list = new ArrayList<>();
      for (char[] c : initTable) {
        list.add(String.copyValueOf(c));
      }
      result.add(list);
      return;
    }
    for (int col = 0; col < n; col++) {
      if (isValid(row, col, n, initTable)) { //如果能放下 那么就进入下一层搜索
        initTable[row][col] = 'Q';
        backTrack(n, row + 1, initTable, result);
        initTable[row][col] = '.';
      }
    }
  }

  public static boolean isValid(int row, int col, int n, char[][] initTable) {
    // 检查列
    for (int i = 0; i < row; ++i) { // 相当于剪枝
      if (initTable[i][col] == 'Q') {
        return false;
      }
    }

    // 检查45度对角线
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (initTable[i][j] == 'Q') {
        return false;
      }
    }

    // 检查135度对角线
    for (int i = row - 1, j = col + 1; i >= 0 && j <= n - 1; i--, j++) {
      if (initTable[i][j] == 'Q') {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(solveNQueens(4));
  }
}
