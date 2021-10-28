import java.util.Arrays;

/**
 * Created by TOM
 * On 2021/10/28 22:01
 */
public class Solution977 {


  public int[] sortedSquares(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }


  public int[] sortedSquaresB(int[] nums) {
    int k = nums.length - 1;
    int[] result = new int[nums.length];

    for (int i = 0, j = nums.length - 1; i <= j; ) {
      if (nums[i] * nums[i] < nums[j] * nums[j]) {
        result[k] = nums[j] * nums[j];
        k--;
        j--;
      } else {
        result[k] = nums[i] * nums[i];
        i++;
        k--;
      }
    }
    return result;
  }
}
