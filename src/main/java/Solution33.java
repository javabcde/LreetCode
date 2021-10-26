/**
 * Created by TOM
 * On 2019/10/26 11:58
 */
public class Solution33 {

  public static void main(String[] args) {
    int[] ints = {2, 3, 4, 5, 6, 7, 8, 9, 1};
    System.out.println(search(ints, 9));

  }

  public static int search(int[] nums, int target) {
    if (nums.length == 0) {
      return -1;
    }
    int index = findIndex(nums);
    if (index == 0) {
      //有序
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target) {
          return i;
        }
      }
    }
    if (target < nums[0]) {
      //start index+1
      return erfen(nums, index + 1, nums.length - 1, target);
    } else if (target > nums[0]) {
      return erfen(nums, 0, index, target);
    } else {
      return 0;
    }
  }

  private static int erfen(int[] nums, int start, int end, int target) {
    int middle = start + ((end - start) >> 1);
    while (start <= end) {
      if (nums[middle] > target) {
        end = middle - 1;
      } else if (nums[middle] < target) {
        start = middle + 1;
      } else {
        return middle;
      }
      //记得加上 start
      middle = start + ((end - start) >> 1);
    }
    return -1;
  }


  private static int findIndex(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      if (i + 1 >= nums.length) {
        //有序 但是根据题意很难出现 除非一个的时候
        return 0;
      }
      if (nums[i] > nums[i + 1]) {
        return i;
      }
    }
    //有序
    return 0;
  }
}
