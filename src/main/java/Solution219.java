import java.util.HashSet;

/**
 * Created by TOM
 * On 2020/6/19 16:52
 */
public class Solution219 {


  public boolean containsNearbyDuplicate(int[] nums, int k) {
    //index,value
    HashSet<Integer> hashMap = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (hashMap.contains(nums[i])) {
        return true;
      }
      hashMap.add(nums[i]);
      if (hashMap.size() > k) {
        hashMap.remove(nums[i - k]);
      }
    }
    return false;
  }
}
