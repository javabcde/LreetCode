import java.util.HashMap;
import java.util.Map;

/**
 * Created by TOM
 * On 2020/4/28 21:34
 */
public class Solution1 {

  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] >= target) {
        continue;
      }
      int target2 = target - nums[i];
      if (map.containsKey(target2)) {
        return new int[]{map.get(target2), i};
      }
      map.put(nums[i], i);
    }
    return new int[]{};
  }
}
