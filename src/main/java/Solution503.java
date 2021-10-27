import com.alibaba.fastjson.JSON;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by TOM
 * On 2021/10/27 21:34
 */
public class Solution503 {

  public static void main(String[] args) {
    System.out.println(JSON.toJSONString(nextGreaterElements(new int[]{1, 2, 1, 1, 2, 1})));
  }

  public static int[] nextGreaterElements(int[] nums) {
    Deque<Integer> stack = new ArrayDeque<>();
    int[] result = new int[nums.length];
    int size = nums.length;

    for (int i = size * 2 - 1; i >= 0; i--) {
      while (!stack.isEmpty() && nums[i % size] >= nums[stack.peek()]) {
        stack.pop();
      }
      result[i % size] = stack.isEmpty() ? -1 : nums[stack.peek()];
      stack.push(i % size);
    }
    return result;
  }

}
