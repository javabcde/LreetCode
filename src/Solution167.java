/**
 * Created by TOM
 * On 2020/1/6 19:45
 */
public class Solution167 {

  public static void main(String[] args) {
    int[] ints = {2, 7, 11, 15};
    int[] twoSum = twoSum(ints, 9);
    System.out.println(twoSum);
  }

  public static int[] twoSum(int[] numbers, int target) {
    int left, right;
    left = 0;
    right = numbers.length - 1;
    while (left < right) {
      int sum = numbers[left] + numbers[right];
      if (sum == target) {
        return new int[]{left + 1, right + 1};
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[]{-1, -1};
  }
}
