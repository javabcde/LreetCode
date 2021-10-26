import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * Created by TOM
 * On 2019/10/17 15:07
 */
public class test {

  public static void main(String[] args) {
    List<List<Integer>> permute = permute(new int[]{1, 2, 3});
    System.out.println(permute);
  }

  public static List<List<Integer>> permute(int[] nums) {
    int len = nums.length;

    List<List<Integer>> res = new ArrayList<>();
    if (len == 0) {
      return res;
    }

    // 使用哈希表检测一个数字是否使用过
    Set<Integer> used = new HashSet<>();
    Stack<Integer> stack = new Stack<>();

    backtrack(nums, 0, len, used, stack, res);
    return res;
  }

  private static void backtrack(int[] nums, int depth, int len, Set<Integer> used, Stack<Integer> stack,
      List<List<Integer>> res) {
    if (depth == len) {
      res.add(new ArrayList<>(stack));
      return;
    }

    for (int i = 0; i < len; i++) {
      if (!used.contains(i)) {
        used.add(i);
        stack.push(nums[i]);

        backtrack(nums, depth + 1, len, used, stack, res);

        stack.pop();
        used.remove(i);
      }
    }
  }
}
