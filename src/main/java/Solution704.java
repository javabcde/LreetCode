/**
 * Created by TOM
 * On 2019/11/12 16:02
 */
public class Solution704 {

  public static void main(String[] args) {
    int[] ints = {-1, 0, 3, 5, 9, 12};
    int search = search(ints, 9);
    System.out.println(search);
  }

  public static int search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
      int mid = start + ((end - start) >> 1);
      if (nums[mid] > target) {
        end = mid - 1;
      } else if (nums[mid] < target) {
        start = mid + 1;
      } else {
        return mid;
      }
    }
    return -1;
  }
}
