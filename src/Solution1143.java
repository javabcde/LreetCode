/**
 * Created by TOM
 * On 2019/11/24 14:31
 */
public class Solution1143 {

  public static void main(String[] args) {
    System.out.println(longestCommonSubsequence("ezupkr", "ubmrapg"));
  }

  public static int longestCommonSubsequence(String text1, String text2) {
    char[] a = text1.toCharArray();
    char[] b = text2.toCharArray();
    int[][] temp = new int[a.length + 1][b.length + 1];
    int cellMax;
    for (int i = 1; i <= a.length; i++) {
      for (int j = 1; j <= b.length; j++) {
        if (a[i - 1] == b[j - 1]) {
          temp[i][j] = temp[i - 1][j - 1] + 1;
        } else {
          cellMax = Math.max(temp[i][j - 1], temp[i - 1][j]);
          temp[i][j] = cellMax;
        }
      }
    }
    return temp[a.length][b.length];
  }
}
