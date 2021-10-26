/**
 * 双指针可以解 简单
 * Created by TOM
 * On 2019/10/11 11:17
 */
public class Solution26 {

  public static void main(String[] args) {
    int[] ints = {1, 1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 10, 18, 19};
    //wode
    int i = solution26(ints);
    //解法2
    //int i = solution26_a(ints);
    System.out.println(i);
    System.out.println(ints);
  }

  private static int solution26_a(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    int fast = 1, slow = 0;
    while (fast < nums.length) {
      if (nums[slow] != nums[fast]) {
        nums[slow + 1] = nums[fast];
        slow++;
      }
      fast++;
    }
    return slow + 1;
  }

  private static int solution26(int[] nums) {
    if (nums.length == 0 || nums.length == 1) {
      return nums.length;
    }
    int p = 0;
    int p1 = 1;
    int num = 0;
    while (p1 < nums.length) {
      if (nums[p] == nums[p1]) {
        num++;
      } else {
        int p2 = p + 1;
        nums[p2] = nums[p1];
        p++;
      }
      p1++;
    }
    return nums.length - num;
  }
}
