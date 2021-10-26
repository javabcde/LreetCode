/**
 * Created by TOM
 * On 2019/12/3 11:30
 */
public class Solution41 {

  public static void main(String[] args) {
    int[] ints = {3, 4, -1, 1};
    System.out.println(firstMissingPositive(ints));
  }

  public static int firstMissingPositive(int[] nums) {
    int length = nums.length;
    if (length == 0) {
      return 1;
    }
    for (int i = 0; i < length; i++) {
      while (nums[i] > 0 && nums[i] < length && nums[i] != nums[nums[i] - 1]) {
        int temp = nums[nums[i] - 1];
        nums[nums[i] - 1] = nums[i];
        nums[i] = temp;
      }
    }
    for (int i = 0; i < length; i++) {
      if (nums[i] != i + 1) {
        return i + 1;
      }
    }
    //说明位置全都正确 那么长度+1
    return length + 1;
  }
}
