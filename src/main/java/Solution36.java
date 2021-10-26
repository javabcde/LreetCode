/**
 * Created by TOM
 * On 2020/2/18 13:08
 */
public class Solution36 {


  public boolean isValidSudoku(char[][] board) {
    //先按照行排查
    for (int i = 0; i < 9; ++i) {
      int[] cow = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      for (int j = 0; j < 9; ++j) {
        if (board[i][j] == '.') {
          continue;
        }
        cow[board[i][j] - '0'] += 1;
        if (cow[board[i][j] - '0'] > 1) {
          return false;
        }
      }
    }
    //按列排查
    for (int j = 0; j < 9; ++j) {
      int[] temp = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
      for (int i = 0; i < 9; ++i) {
        if (board[i][j] == '.') {
          continue;
        }
        temp[board[i][j] - '0'] += 1;
        if (temp[board[i][j] - '0'] > 1) {
          return false;
        }
      }
    }
    //按照3*3排查
    for (int i = 0; i < 9; i = i + 3) {
      for (int j = 0; j < 9; j = j + 3) {
        int[] temp = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int x = i; x < i + 3; x++) {
          for (int y = j; y < j + 3; y++) {
            if (board[x][y] == '.') {
              continue;
            }
            temp[board[x][y] - '0'] += 1;
            if (temp[board[x][y] - '0'] > 1) {
              return false;
            }
          }
        }
      }
    }
    return true;
  }
}
