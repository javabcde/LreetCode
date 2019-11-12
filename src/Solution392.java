/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * Created1 by TOM
 * On 2019/10/18 19:50
 */
public class Solution392 {

  public static void main(String[] args) {
    System.out.println(isSubsequence("", "ahbgdcb"));
  }

  public static boolean isSubsequence(String s, String t) {
    if (s.length() == 0) {
      return true;
    }
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    int flag = 0;
    for (int i = 0; i < tChars.length; i++) {
      if (sChars[flag] == tChars[i]) {
        flag++;
      }
      if (flag == sChars.length) {
        return true;
      }
    }
    return false;
  }
}
