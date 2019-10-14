import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LeetCode第15题 三数之和
 * Created by TOM
 * On 2019/10/11 15:08
 */
public class Solution15 {

  public static void main(String[] args) {
    //-1, 0, 1, 2, -1, -4
    List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    System.out.println(lists);
  }

  static List<List<Integer>> threeSum(int[] nums) {
    if (nums.length < 3) {
      return new ArrayList<>();
    }
    //先排序
    List<List<Integer>> lists = new ArrayList<>();
    Arrays.sort(nums);
    boolean lflag = false;
    boolean rflag = false;
    int a = 0, b = 1, c = nums.length - 1;
    while (a < nums.length) {
      if (b == nums.length - 1) {
        lflag = true;
      }
      if (c == 0) {
        rflag = true;
      }
      //重置
      if (lflag && rflag) {
        a++;
        b = 0;
        c = nums.length - 1;
      }
      if ((nums[a] + nums[b] + nums[c]) == 0) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[a]);
        list.add(nums[b]);
        list.add(nums[c]);
        boolean flag = true;
        for (List<Integer> integers : lists) {
          if (integers.contains(nums[a]) && integers.contains(nums[b]) && integers.contains(nums[c])) {
            flag = false;
            break;
          }
        }
        if (flag) {
          lists.add(list);
        }
        a++;
        b = 0;
        c--;
      } else {
        if (!lflag) {
          b++;
        }
      }
    }
    return lists;
  }
}
