/**
 * Created by TOM
 * On 2019/11/24 17:53
 */
public class Solution198 {

  public static void main(String[] args) {
    int[] ints = {2, 7, 9, 3, 1};
    System.out.println(rob(ints));
  }

  public static int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int[] temp = new int[nums.length + 1];
    temp[0] = 0;
    temp[1] = nums[0];
    for (int i = 2; i <= nums.length; i++) {
      temp[i] = Math.max(temp[i - 2] + nums[i - 1], temp[i - 1]);
    }
    return temp[nums.length];
  }
}
