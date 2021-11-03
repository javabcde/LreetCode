/**
 * Created by TOM
 * On 2021/10/29 19:56
 */
public class Solution209 {


  public static void main(String[] args) {
    System.out.println(minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    ;
  }

  public static int minSubArrayLen(int target, int[] nums) {
    int slow = 0;
    int sum = 0;
    int windowSize = Integer.MAX_VALUE;
    for (int fast = 0; fast < nums.length; fast++) {
      sum += nums[fast];
      while (sum >= target) {
        windowSize = Math.min(windowSize, fast - slow + 1);
        sum -= nums[slow];
        slow++;
      }
    }
    return windowSize == Integer.MAX_VALUE ? 0 : windowSize;
  }

}
