/**
 * Created by TOM
 * On 2020/5/4 22:57
 */
public class reCode {

  public int jump(int[] nums) {
    int maxIndex = 0;
    int res = 0;
    int end = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      maxIndex = Math.max(maxIndex, nums[i] + i);
      if (i == end) {
        end = maxIndex;
        res++;
      }
    }
    return res;
  }
}
