package dsa;

/**
 * Created by TOM
 * On 2019/11/2 17:21
 */
public class fastSortTest {

  public static void main(String[] args) {
    int[] arr = {1, 1, 1, 0, 0, 0, 2, 2, 2};
    sortnum(arr, 1);
    for (int i = 0; i <= arr.length - 1; i++) {
      System.out.println(arr[i]);
    }
  }

  /**
   * 荷兰国旗
   * 给定一个数组arr，和一个数num，请把小于num的数放在数组的左边，等于num的书放在中间，大于num的数放在右边。 要求：时间复杂度O（n），额外空间复杂度O(1)
   * i每找到一个小于flag的数，就和left交换，然后left++
   *
   * i每找到一个大于flag的数，就和right交换，然后right--
   *
   * 大于的放后面，小于的放前面，等于的自然就放在中间了；
   */
  public static void sortnum(int[] arr, int num) {
    int small = -1;
    int big = arr.length;
    int current = 0;
    while (current != big) {
      if (arr[current] < num) {
        swap(arr, ++small, current++);
      } else if (arr[current] == num) {
        current++;
      } else if (arr[current] > num) {
        swap(arr, --big, current);
      }
    }
  }

  private static void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
