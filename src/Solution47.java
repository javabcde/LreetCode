import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 好像觉得直接可以用46题的代码.
 * Created by TOM
 * On 2019/12/24 16:18
 */
public class Solution47 {

  public static void main(String[] args) {
    int[] ints = {1, 2, 1};
    List<List<Integer>> permute = permuteUnique(ints);
    System.out.println(permute);
  }

  public static List<List<Integer>> permuteUnique(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] temp = new boolean[nums.length];
    Arrays.fill(temp, false);
    List<Integer> list = new ArrayList();
    for (int num : nums) {
      list.add(num);
    }
    stackThis(result, new Stack<>(), list, temp, 0);
    return result;
  }

  private static void stackThis(List<List<Integer>> result, Stack<Integer> stack, List<Integer> nums, boolean[] temp,
      int deep) {
    if (stack.size() == nums.size()) {
      result.add(new ArrayList<>(stack));
      return;
    }
    for (int i = 0; i < nums.size(); i++) {
      if (deep == 0 && nums.indexOf(nums.get(i)) < i) {
        continue;
      }
      if (!temp[i]) {
        stack.push(nums.get(i));
        temp[i] = true;
        deep++;
        stackThis(result, stack, nums, temp, deep);
        stack.pop();
        temp[i] = false;
        deep--;
      }
    }
  }
}
