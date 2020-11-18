import java.util.HashSet;
import java.util.Set;

/**
 * Created by TOM
 * On 2020/11/18 15:29
 */
public class Solution575 {

  public int distributeCandies(int[] candies) {
    int max = candies.length >> 1;
    // 糖果种类/计数
    Set<Integer> temp = new HashSet<>();
    for (int candy : candies) {
      temp.add(candy);
    }
    return Math.min(max, temp.size());
  }
}
