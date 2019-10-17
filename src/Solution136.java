/**
 * Created by TOM
 * On 2019/10/16 21:48
 */
public class Solution136 {

  public static void main(String[] args) {
    int i = singleNumber(new int[]{1, 1, 2, 2, 3, 3, 5, 6, 6});
    System.out.println(i);
  }

  public static int singleNumber(int[] nums) {
    int result = 0;
    for (int i = 0; i < nums.length; i++) {
      result = result ^ nums[i];
    }
    return result;
  }
}
