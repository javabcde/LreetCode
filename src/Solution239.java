import java.util.LinkedList;

/**
 * Created by TOM
 * On 2020/1/7 15:55
 */
public class Solution239 {

  public static void main(String[] args) {
    int[] ints = {1, 3, -1, -3, 5, 3, 6, 7};
    int[] slidingWindow = maxSlidingWindow(ints, 3);
    System.out.println(slidingWindow);

  }

  public static int[] maxSlidingWindow(int[] nums, int k) {
    if (nums.length == 0 || k == 0) {
      return new int[]{};
    }
    int[] result = new int[nums.length - k + 1];
    int index = 0;
    LinkedList<Integer> queue = new LinkedList<>();
    for (int i = 0; i < nums.length; i++) {
      while (!queue.isEmpty() && nums[queue.getLast()] < nums[i]) {
        queue.removeLast();
      }
      queue.addLast(i);
      if (queue.peekFirst() == i - k) {
        queue.pollFirst();
      }
      if (i >= k - 1) {
        result[index++] = nums[queue.peekFirst()];
      }
    }
    return result;
  }
}
