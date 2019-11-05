package dsa;

/**
 * Created by TOM
 * On 2019/11/2 17:21
 */
public class fastSortTest {

  public static void main(String[] args) {
    int[] ints = {1, 5, 6, 9, 8, 1, 7, 8, 4};
    sort(ints, 0, ints.length - 1);
    System.out.println(ints);
  }

  public static void sort(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }
    int middle = partner(nums, start, end);
    sort(nums, start, middle - 1);
    sort(nums, middle + 1, end);
  }

  private static int partner(int[] nums, int start, int end) {
    int jizhun = nums[end];
    int fast = start;
    int slow = start;
    while (fast < end) {
      if (nums[fast] < jizhun) {
        swap(nums, fast, slow);
        slow++;
      }
      fast++;
    }
    swap(nums, slow, end);
    return slow;
  }

  private static void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }
}
