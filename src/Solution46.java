import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by TOM
 * On 2019/12/24 11:44
 */
public class Solution46 {

  public static void main(String[] args) {
    int[] ints = {1, 2, 3, 4};
    List<List<Integer>> permute = permute(ints);
    System.out.println(permute);
  }

  public static List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    boolean[] temp = new boolean[nums.length];
    Arrays.fill(temp, false);
    stackThis(result, new Stack<Integer>(), nums, temp);
    return result;
  }

  private static void stackThis(List<List<Integer>> result, Stack<Integer> stack, int[] nums, boolean[] temp) {
    if (stack.size() == nums.length) {
      result.add(new ArrayList<>(stack));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!temp[i]) {
        stack.push(nums[i]);
        temp[i] = true;
        stackThis(result, stack, nums, temp);
        stack.pop();
        temp[i] = false;
      }
    }
  }
}
