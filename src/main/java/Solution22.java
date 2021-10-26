import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2019/10/15 0:08
 */
public class Solution22 {

  public static void main(String[] args) {
    List<String> strings = generateParenthesis(3);
    System.out.println(strings);
  }

  public static List<String> generateParenthesis(int n) {

    List<String> list = new ArrayList<>();
    if (n == 0) {
      return list;
    }
    int left = 0;
    int right = 0;
    String s = "";
    stackThis(list, s, left, right, n);
    return list;
  }

  private static void stackThis(List<String> list, String s, int left, int right, int n) {
    if (s.length() == n * 2) {
      list.add(s);
      //弹栈
      return;
    }
    if (left < n) {
      stackThis(list, s + "(", left + 1, right, n);
    }
    if (right < left) {
      stackThis(list, s + ")", left, right + 1, n);
    }
  }
}
