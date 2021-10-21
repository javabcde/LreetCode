package 剑指Offer;

/**
 * Created by TOM
 * On 2021/10/19 10:24
 */
public class 剑指Offer21调整数组顺序使奇数位于偶数前面 {


  public int[] exchange(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    while (start < end) {
      if (nums[start] % 2 == 1) {
        start++;
        continue;
      }
      if (nums[end] % 2 == 0) {
        end--;
        continue;
      }
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
    }
    return nums;
  }
}
