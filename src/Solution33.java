/**
 * Created by TOM
 * On 2019/10/26 11:58
 */
public class Solution33 {

  public static void main(String[] args) {
    int[] ints = {4, 5, 6, 7, 0, 1, 2};
    int search = search(ints, 2);
    System.out.println(search);
  }


  public static int search(int[] nums, int target) {
    int returnValue = stackThis(nums, 0, nums.length - 1, target);
    return returnValue;
  }

  private static int stackThis(int[] nums, int start, int end, int target) {
    int mid = start + ((end - start) >> 1);
    if (nums[start] <= nums[mid]) {
      //有序
      while (start <= end) {
        if (nums[mid] < target) {
          start = mid + 1;
        } else if (nums[mid] > target) {
          end = mid - 1;
        } else {
          return mid;
        }
        mid = start + ((end - start) >> 1);
      }
      return stackThis(nums, mid, end, target);
    } else {
      //无序
      return stackThis(nums, mid, end, target);
    }
  }
}
