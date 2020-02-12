/**
 * Created by TOM
 * On 2020/2/12 23:41
 */
public class Solution540 {

  public static void main(String[] args) {
    int[] ints = {1, 1, 2, 3, 3, 4, 4, 8, 8};
    System.out.println(singleNonDuplicate(ints));
  }

  public static int singleNonDuplicate(int[] nums) {
    int one = 0;
    int two = 1;
    for (int i = 0; i < nums.length; i++) {
      if (two < nums.length && nums[one] != nums[two]) {
        return nums[one];
      } else if (two == nums.length) {
        return nums[one];
      }
      one = one + 2;
      two = two + 2;
    }
    return 0;
  }
}
