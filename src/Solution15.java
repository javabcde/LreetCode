import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode第15题 三数之和
 * Created by TOM
 * On 2019/10/11 15:08
 */
public class Solution15 {

  public static void main(String[] args) {
    //-1, 0, 1, 2, -1, -4
    List<List<Integer>> lists = threeSum(new int[]{10, 12, -25, 55, 44, -22});
  }

  static List<List<Integer>> threeSum(int[] nums) {
    //先排序
    List<Integer> numSort = new ArrayList<>();
    int p = 0;
    int p1 = 1;
    while (p1 <= nums.length) {
      if (nums[p] < nums[p1]) {
        numSort.add(nums[p]);
      }
    }
    return null;
  }
}
