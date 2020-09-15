/**
 * Created by TOM
 * On 2020/9/15 13:16
 */
public class Solution79 {


  public boolean exist(char[][] board, String word) {

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (dfs(board, i, j, word, 0)) {
          return true;
        }
      }
    }
    return false;
  }

  private boolean dfs(char[][] board, int i, int j, String word, int index) {
    if (word.length() == index) {
      return true;
    }
    if (i < 0 || j < 0 || i >= board.length || j >= board[0].length) {
      return false;
    }
    if (word.charAt(index) != board[i][j]) {
      return false;
    }
    //找到了当前的字符
    char mark = board[i][j];
    board[i][j] = '1';
    boolean res = dfs(board, i + 1, j, word, index + 1) ||
        dfs(board, i - 1, j, word, index + 1) ||
        dfs(board, i, j + 1, word, index + 1) ||
        dfs(board, i, j - 1, word, index + 1);
    board[i][j] = mark;
    return res;
  }
}
