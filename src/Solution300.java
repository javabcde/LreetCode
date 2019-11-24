import java.util.Arrays;

/**
 * Created by TOM
 * On 2019/11/21 17:38
 */
public class Solution300 {

  public static void main(String[] args) {
    int[] ints = {1, 3, 6, 7, 9, 4, 10, 5, 6};
    System.out.println(lengthOfLIS(ints));
  }

  public static int lengthOfLIS(int[] nums) {
    int[] temp = new int[nums.length];
    Arrays.fill(temp, 1);
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[i] > nums[j]) {
          temp[i] = Math.max(temp[i], temp[j] + 1);
        }
      }
    }
    int max = 0;
    for (int i : temp) {
      max = Math.max(max, i);
    }
    return max;
  }
}
