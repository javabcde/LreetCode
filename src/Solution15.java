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
    List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4, 5});
    threeSuma(new int[]{-1, 0, 1, 2, -1, -4, 5});
    System.out.println(lists);
  }

  private static List<List<Integer>> threeSuma(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    int len = nums.length;
    if (len < 3) {
      return ans;
    }
    Arrays.sort(nums); // 排序
    for (int i = 0; i < len; i++) {
      if (nums[i] > 0) {
        break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
      }
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue; // 去重
      }
      int L = i + 1;
      int R = len - 1;
      while (L < R) {
        int sum = nums[i] + nums[L] + nums[R];
        if (sum == 0) {
          ans.add(Arrays.asList(nums[i], nums[L], nums[R]));
          while (L < R && nums[L] == nums[L + 1]) {
            L++; // 去重
          }
          while (L < R && nums[R] == nums[R - 1]) {
            R--; // 去重
          }
          L++;
          R--;
        } else if (sum < 0) {
          L++;
        } else {
          R--;
        }
      }
    }
    return ans;
  }

  //wode
  static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> lists = new ArrayList<>();
    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;
    //  left<middle<right
    int middle = left + 1;
    while (!(left == right)) {
      if (nums[left] + nums[middle] + nums[right] == 0) {
        List<Integer> list = new ArrayList<>();
        list.add(nums[left]);
        list.add(nums[middle]);
        list.add(nums[right]);
        lists.add(list);
        left++;
        middle = left + 1;
      }
      if (middle < right) {
        middle++;
      } else if (Math.abs(nums[left]) < Math.abs(nums[right])) {
        right--;
        middle = left + 1;
      } else if (Math.abs(nums[left]) > Math.abs(nums[right])) {
        left++;
        middle = left + 1;
      } else if (Math.abs(nums[left]) == Math.abs(nums[right])) {
        middle = left + 1;
      }
    }
    return lists;
  }
}
