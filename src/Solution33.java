/**
 * Created by TOM
 * On 2019/10/26 11:58
 */
public class Solution33 {

  public static void main(String[] args) {
    int[] ints = {1, 2};
    int search = search(ints, 2);
    System.out.println(search);
  }


  public static int search(int[] nums, int target) {
    int index = findParten(nums);
    int first = 0;
    int end;
    int millde;
    if (nums.length == 0) {
      return -1;
    }
    if (nums[0] < target) {
      end = index;
      millde = first + ((end - first) >> 1);
      while (first <= end) {
        if (nums[millde] < target) {
          first = millde + 1;
        } else if (nums[millde] > target) {
          end = millde - 1;
        } else if (nums[millde] == target) {
          return millde;
        }
        millde = first + ((end - first) >> 1);
      }
    } else {
      first = index;
      end = nums.length - 1;
      millde = first + ((end - first) >> 1);
      while (first <= end) {
        if (nums[millde] < target) {
          first = millde + 1;
        } else if (nums[millde] > target) {
          end = millde - 1;
        } else if (nums[millde] == target) {
          return millde;
        }
        millde = first + ((end - first) >> 1);
      }
    }
    return -1;
  }

  private static int findParten(int[] nums) {
    int fast = 1;
    int slow = 0;
    while (fast < nums.length - 1) {
      if (nums[slow] > nums[fast]) {
        return slow;
      }
      fast++;
      slow++;
    }
    return -1;
  }
}
