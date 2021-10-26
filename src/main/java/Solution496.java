import com.alibaba.fastjson.JSON;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * 单调找
 * Created by TOM
 * On 2021/10/26 13:07
 */
public class Solution496 {


  public static void main(String[] args) {
    System.out.println(JSON.toJSONString(nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
  }

  public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
    Map<Integer, Integer> temp = new HashMap<>();
    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = nums2.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && nums2[i] > nums2[stack.peek()]) {
        stack.pop();
      }
      temp.put(nums2[i], stack.isEmpty() ? -1 : nums2[stack.peek()]);
      stack.push(i);
    }
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      result[i] = temp.get(nums1[i]);
    }
    return result;
  }
}
