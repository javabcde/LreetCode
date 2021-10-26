/**
 * Created by TOM
 * On 2019/10/12 20:59
 */
public class Solution35 {

  public static void main(String[] args) {

  }

  public static int searchInserta(int[] nums, int target) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] >= target) {
        return i;
      }
      i++;
    }
    return nums.length;
  }
}
