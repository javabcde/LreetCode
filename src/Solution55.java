/**
 * Created by TOM
 * On 2019/11/8 18:57
 */
public class Solution55 {

  public static void main(String[] args) {
    int[] ints = {1, 1, 1, 0};
    System.out.println(canJump(ints));
  }

  public static boolean canJump(int[] nums) {
    //节点可以走的最长距离
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (i > max) {
        return false;
      }
      if (i + nums[i] >= nums.length) {
        return true;
      }
      max = Math.max(max, i + nums[i]);
    }
    return true;
  }
}
