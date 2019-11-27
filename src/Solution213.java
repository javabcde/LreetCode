import java.util.Arrays;

/**
 * Created by TOM
 * On 2019/11/24 18:28
 */
public class Solution213 {

  public static void main(String[] args) {
    int[] ints = {1, 2};
    System.out.println(rob(ints));
  }

  public static int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    if (nums.length == 1) {
      return nums[0];
    }
    int i = rob1(Arrays.copyOfRange(new int[]{}, 0, nums.length - 1));
    int j = rob1(Arrays.copyOfRange(new int[]{}, 1, nums.length));
    return Math.max(i, j);
  }

  public static int rob1(int[] nums) {
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

