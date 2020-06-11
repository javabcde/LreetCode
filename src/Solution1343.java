/**
 * 给你一个整数数组 arr 和两个整数 k 和 threshold 。
 *
 * 请你返回长度为 k 且平均值大于等于 threshold 的子数组数目。
 *
 * Created by TOM
 * On 2020/6/11 14:48
 */
public class Solution1343 {

  public int numOfSubarrays(int[] arr, int k, int threshold) {

    int sum = 0, result = 0;
    int target = k * threshold;
    for (int i = 0; i < k; i++) {
      sum += arr[i];
    }
    if (sum >= target) {
      result++;
    }
    for (int i = 0; i < arr.length - k; i++) {
      sum = sum - arr[i] + arr[i + k];
      if (sum >= target) {
        result++;
      }
    }
    return result;
  }
}
