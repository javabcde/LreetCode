/**
 * Created by TOM
 * On 2019/12/7 20:17
 */
public class Solution48 {

  public void rotate(int[][] matrix) {
    int length = matrix.length;
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length; j++) {
        int tmp = matrix[j][i];
        matrix[j][i] = matrix[i][j];
        matrix[i][j] = tmp;
      }
    }
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length >> 1; j++) {
        int tmp = matrix[i][j];
        matrix[i][j] = matrix[i][length - j - 1];
        matrix[i][length - j - 1] = tmp;
      }
    }
  }
}
