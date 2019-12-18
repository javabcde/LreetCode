/**
 * Created by TOM
 * On 2019/12/3 18:06
 */
public class Solution45 {

  public static void main(String[] args) {
    int[] ints = {2, 3, 5, 9, 0, 0, 7, 5, 6, 7, 2, 4, 8, 1};
    System.out.println(jump(ints));
  }

  public static int jump(int[] nums) {
    if (nums.length == 1) {
      return 0;
    }
    int length = nums.length - 1;
    int max = 0;
    int count = 0;
    int end = 0;
    //直接遍历 找出每次最大的值?
    for (int i = 0; i < length; i++) {
      max = Math.max(max, nums[i] + i);
      //最远距离
      if (i == end) {
        //更新到这个位置时候的可以走的最大距离
        end = max;
        //+1
        count++;
      }
    }
    return count;
  }
}
