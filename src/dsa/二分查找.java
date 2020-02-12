package dsa;

/**
 * Created by TOM
 * On 2019/10/23 0:12
 */
public class 二分查找 {

  public static void main(String[] args) {
    int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    int erfen = erfen(ints, 12);
    System.out.println(erfen);
  }

  //todo 有缺陷 太长了会溢出
  private static int erfen(int[] nums, int value) {
    int first = 0;
    int end = nums.length - 1;
    int middle = first + ((end - first) >> 1);
    while (first <= end) {
      if (nums[middle] > value) {
        //明显大于目标值 所以长度middle-1
        end = middle - 1;
      } else if (nums[middle] < value) {
        first = middle + 1;
      } else if (nums[middle] == value) {
        return nums[middle];
      }
      middle = (first + end) / 2;
    }
    return 0;
  }

}
