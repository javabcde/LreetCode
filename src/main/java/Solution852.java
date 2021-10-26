/**
 * Created by TOM
 * On 2020/11/10 9:37
 */
public class Solution852 {

  public static void main(String[] args) {
  }

  public int peakIndexInMountainArray(int[] arr) {
    int start = 0, end = arr.length - 1;
    while (start < end) {
      int middle = start + ((end - start) >> 1);
      if (arr[middle] < arr[middle + 1]) {
        start = middle + 1;
      } else {
        end = middle;
      }
    }
    return start;
  }
}
