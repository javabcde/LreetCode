import java.util.Arrays;

/**
 * 还能用set
 * Created by TOM
 * On 2019/10/16 21:07
 */
public class Solution217 {

  public static void main(String[] args) {

  }

  public boolean containsDuplicate(int[] nums) {
    return Arrays.stream(nums).distinct().count() != nums.length;
  }
}
