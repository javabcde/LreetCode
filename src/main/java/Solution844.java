/**
 * Created by TOM
 * On 2021/10/28 17:15
 */
public class Solution844 {

  public static boolean backspaceCompare(String s, String t) {
    int sIndex = s.length() - 1;
    int tIndex = t.length() - 1;

    int preDelSNum = 0;
    int preDelTNum = 0;

    char del = '#';
    while (sIndex >= 0 || tIndex >= 0) {
      while (sIndex >= 0) {
        if (s.charAt(sIndex) == del) {
          preDelSNum++;
          sIndex--;
        } else if (preDelSNum > 0) {
          preDelSNum--;
          sIndex--;
        } else {
          break;
        }
      }
      while (tIndex >= 0) {
        if (t.charAt(tIndex) == del) {
          preDelTNum++;
          tIndex--;
        } else if (preDelTNum > 0) {
          preDelTNum--;
          tIndex--;
        } else {
          break;
        }
      }
      if (sIndex >= 0 && tIndex >= 0) {
        if (s.charAt(sIndex) != t.charAt(tIndex)) {
          return false;
        }
      } else if (sIndex >= 0 || tIndex >= 0) {
        /*  // (i >= 0 && j >= 0) 为 false 情况为
            // 1. i < 0 && j >= 0
            // 2. j < 0 && i >= 0
            // 3. i < 0 && j < 0
            // 其中，第 3 种情况为符合题意情况，因为这种情况下 s 和 t 都是 index = 0 的位置为 '#' 而这种情况下
            // 退格空字符即为空字符，也符合题意，应当返回 True。
            // 但是，情况 1 和 2 不符合题意，因为 s 和 t 其中一个是在 index >= 0 处找到了待比较字符，另一个没有找到
            // 这种情况显然不符合题意，应当返回 False，下式便处理这种情况。
            */
        return false;
      }
      sIndex--;
      tIndex--;
    }
    return true;
  }
}
