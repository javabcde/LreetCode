import java.util.HashSet;
import java.util.Set;

/**
 * Created by TOM
 * On 2019/12/27 11:48
 */
public class Solution287 {

  public int findDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      if (set.contains(num)) {
        return num;
      }
      set.add(num);
    }
    return 0;
  }
}
