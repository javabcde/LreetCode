import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by TOM
 * On 2019/10/17 17:05
 */
public class Solution77 {

  public static void main(String[] args) {
    List<List<Integer>> combine = combine(4, 2);
    System.out.println(combine);
  }

  public static List<List<Integer>> combine(int n, int k) {
    List<List<Integer>> lists = new ArrayList<>();
    stackThis(lists, n, k, new Stack<>(), 1);

    return lists;
  }

  private static void stackThis(List<List<Integer>> lists, int n, int k, Stack<Integer> stack, int index) {
    if (stack.size() == k) {
      lists.add(new ArrayList<>(stack));
      return;
    }
    for (int i = index; i <= n; i++) {
      if (!stack.contains(i)) {
        stack.push(i);
        stackThis(lists, n, k, stack, i + 1);
        stack.pop();
      }
    }
  }
}
