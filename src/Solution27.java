/**
 * Created by TOM
 * On 2019/10/12 15:45
 */
public class Solution27 {

  public static void main(String[] args) {
    int[] ints = {0, 1, 3, 3, 3};
    int i = removeElement(ints, 3);
    System.out.println(i);
  }

  public static int removeElement(int[] nums, int val) {
    if (nums.length == 1) {
      nums = new int[]{};
      return 1;
    }
    //移除等于val的
    int slow = 0, fast = 0, sum = 0;
    while (fast < nums.length) {
      if (nums[fast] != val) {
        nums[slow] = nums[fast];
        slow++;
        fast++;
      } else {
        fast++;
        sum++;
      }
    }
    return nums.length - sum;
  }
}
