/**
 * Created by TOM
 * On 2019/11/12 13:16
 */
public class Solution34 {

  public static void main(String[] args) {
    int[] ints = {2};
    int[] ints1 = searchRange(ints, 3);
    System.out.println(ints1);
  }

  public static int[] searchRange(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    int head = -1;
    int tail = -1;
    if (nums.length == 0) {
      return new int[]{head, tail};
    }
    head = findLeft(nums, target, start, end, head);
    //优化:没有找到 左边的 那么右边也没有必要找了
    if (head == -1) {
      return new int[]{-1, -1};
    }
    tail = findRight(nums, target, head, end, tail);
    return new int[]{head, tail};
  }

  private static int findRight(int[] nums, int target, int start, int end, int tail) {
    while (start <= end) {
      int mid = start + ((end - start) >> 1);
      if (nums[mid] < target) {
        start = mid + 1;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        if (mid == nums.length - 1 || nums[mid] != nums[mid + 1]) {
          tail = mid;
        }
        start = mid + 1;
      }
    }
    return tail;
  }

  private static int findLeft(int[] nums, int target, int start, int end, int head) {
    while (start <= end) {
      int mid = start + ((end - start) >> 1);
      if (nums[mid] < target) {
        start = mid + 1;
      } else if (nums[mid] > target) {
        end = mid - 1;
      } else {
        if (mid == 0 || nums[mid] != nums[mid - 1]) {
          head = mid;
        }
        end = mid - 1;
      }
    }
    return head;
  }
}
