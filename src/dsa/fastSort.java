package dsa;

/**
 * Created by TOM
 * On 2019/10/24 22:53
 */
public class fastSort {

  public static void main(String[] args) {
    int[] ints = {1, 5, 6, 9, 8, 1, 7, 8, 4};
    fastSort(ints);
    System.out.println(ints);
  }

  public static void fastSort(int[] nums) {
    int length = nums.length;
    //数组 和两个下标
    thisFastSort(nums, 0, length - 1);
  }

  private static void thisFastSort(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }
    int middle = partition(nums, start, end);
    thisFastSort(nums, start, middle - 1);
    thisFastSort(nums, middle + 1, end);
  }

  private static int partition(int[] nums, int start, int end) {
    //以最后一个数作为标准数
    int pivot = nums[end];
    int i = start;
    int j = start;
    //双指针
    while (j < end) {
      if (nums[j] < pivot) {
        swap(nums, i, j);
        i++;
      }
      j++;
    }
    swap(nums, i, end);
    return i;
  }

  private static void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
