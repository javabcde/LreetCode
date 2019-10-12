/**
 * Created by TOM
 * On 2019/10/12 20:47
 */
public class Solution28 {

  public static void main(String[] args) {
    int i = strStr("hello", "ll");
  }

  private static int strStr(String haystack, String needle) {
    if (needle == null) {
      return 0;
    }
    return haystack.indexOf(needle);
  }
}
