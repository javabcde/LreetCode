/**
 * Created by TOM
 * On 2020/11/19 9:44
 */
public class Solution283 {

  public void moveZeroes(int[] nums) {
    for (int i = 0, j = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        swap(i, j, nums);
        j++;
      }
    }
  }

  private void swap(int i, int j, int[] nums) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
