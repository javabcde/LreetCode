/**
 * Created by TOM
 * On 2020/4/24 10:12
 */
public class OfferSolution51 {

  public static void main(String[] args) {
    int[] ints = {7, 5, 6, 4};
    System.out.println(reversePairs(ints));
  }

  /**
   * 归并
   */
  public static int reversePairs(int[] nums) {
    int count = stackMerge(nums, 0, nums.length - 1);
    return count;
  }

  private static int stackMerge(int[] nums, int L, int R) {
    if (L == R) {
      return 0;
    }
    int middle = L + ((R - L) >> 2);
    return stackMerge(nums, L, middle) + stackMerge(nums, middle + 1, R) + merge(nums, L, middle, R);
  }

  private static int merge(int[] nums, int l, int middle, int r) {
    int[] temps = new int[r - l + 1];
    int l1 = l;
    int r1 = middle + 1;
    int tempIndex = 0;
    int count = 0;
    while (l1 <= middle && r1 <= r) {
      if (nums[l1] >= nums[r1]) {
        count += middle - l + 1;
      }
      temps[tempIndex++] = nums[l1] > nums[r1] ? nums[r1++] : nums[l1++];
    }
    if (l1 <= middle) {
      temps[tempIndex++] = nums[l1++];
    }
    if (r1 <= r) {
      temps[tempIndex++] = nums[r1++];
    }
    if (temps.length >= 0) {
      System.arraycopy(temps, 0, nums, l, temps.length);
    }
    return count;
  }
  /*
   * public int reversePairs(int[] nums) {
   *         return merge(nums, 0, nums.length - 1);
   *     }
   *
   *     int merge(int[] arr, int start, int end) {
   *         if (start >= end) return 0;
   *         int mid = (start + end) / 2;
   *         int count = merge(arr, start, mid) + merge(arr, mid + 1, end);
   *
   *         int[] temp = new int[end - start + 1];
   *         int i = start, j = mid + 1, k = 0;
   *         while (i <= mid && j <= end) {
   *             count += arr[i] <= arr[j] ? j - (mid + 1) : 0;
   *             temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
   *         }
   *         while (i <= mid) {
   *             //把多余的也算进去
   *             count += j - (mid + 1);
   *             temp[k++] = arr[i++];
   *         }
   *         while (j <= end)
   *             temp[k++] = arr[j++];
   *         System.arraycopy(temp, 0, arr, start, end - start + 1);
   *         return count;
   *     }
   */

  /**
   * 暴力解法 超时
   *
   * @param nums
   * @return
   */
  public static int reversePairs0(int[] nums) {
    int i, j, sum = 0;
    for (i = 0; i < nums.length; i++) {
      for (j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[i]) {
          sum++;
        }
      }
    }
    return sum;
  }
}
