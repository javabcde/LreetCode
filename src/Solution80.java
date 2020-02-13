/**
 * Created by TOM
 * On 2020/2/13 23:15
 */
public class Solution80 {

  public static void main(String[] args) {

  }

  //把数字移动到数组后面就行
  public int removeDuplicates(int[] nums) {
    if (nums.length <= 2) {
      return nums.length;
    }
    int slow = 1;
    int fast = 1;
    int count = 1;
    while (fast < nums.length) {
      if (nums[fast] == nums[fast - 1]) {
        count++;
      } else {
        count = 1;
      }
      if (count < 3) {
        nums[slow] = nums[fast];
        slow++;
      }
      fast++;
    }
    return nums.length;
  }
}
