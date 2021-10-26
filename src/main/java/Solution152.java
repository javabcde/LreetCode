/**
 * Created by TOM
 * On 2020/4/28 15:38
 */
public class Solution152 {

  public static void main(String[] args) {
    System.out.println(maxProduct(new int[]{1, 2, 3, 4, 5, 6, 7, -1}));
  }


  public static int maxProduct(int[] nums) {
    int n = nums.length;
    if (n == 0) {
      return 0;
    } else if (n == 1) {
      return nums[0];
    }
    int p = nums[0];
    int maxP = nums[0];
    int minP = nums[0];
    for (int i = 1; i < n; i++) {
      int maxTemp = maxP;
      //这一次新乘积取最大值
      maxP = Math.max(Math.max(maxP * nums[i], nums[i]), minP * nums[i]);
      //这一次新乘积取最小值
      minP = Math.min(Math.min(maxTemp * nums[i], nums[i]), minP * nums[i]);
      p = Math.max(maxP, p);
    }
    return p;
  }
}
