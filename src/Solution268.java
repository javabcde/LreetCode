import java.util.Arrays;

/**
 * Created by TOM
 * On 2019/12/27 15:57
 */
public class Solution268 {

  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
      if (i != nums[i]) {
        return i;
      }
    }
    return nums.length;
  }
}
