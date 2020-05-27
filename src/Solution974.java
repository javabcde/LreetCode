import java.util.HashMap;
import java.util.Map;

/**
 * Created by TOM
 * On 2020/5/27 11:05
 */
public class Solution974 {

  /**
   * // 计算同余法
   * // 用sum保存前n个数之和
   * // 计算每个sum的余数，保存
   * // 余数相同则可以整除 ， 如
   * // A = [4,5,0,-2,-3,1], K = 5
   * // p[0] = 4, p[1] = 9, p[2] = 9, p[3] = 7, p[4] = 4, p[5] = 5
   * // 余数对应 4,4,4,2,4,0;
   * // 余数4有4个，排列组合法，计算4*3/2 = 6
   * // 0余数相当于整除，用排列组合法(初始0赋值1)， 2*1/2 = 1;
   * // 最终答案为7
   *
   * 作者：qi-xi-5
   * 链接：https://leetcode-cn.com/problems/subarray-sums-divisible-by-k/solution/guan-fang-ti-jie-tong-yu-fa-by-qi-xi-5/
   * 来源：力扣（LeetCode）
   * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
   */
  public int subarraysDivByK(int[] A, int K) {
    Map<Integer, Integer> record = new HashMap<>();
    record.put(0, 1);
    int sum = 0, ans = 0;
    for (int elem : A) {
      sum += elem;
      // 注意 Java 取模的特殊性，当被除数为负数时取模结果为负数，需要纠正
      int modulus = Math.floorMod(sum, K);
      int same = record.getOrDefault(modulus, 0);
      ans += same;
      record.put(modulus, same + 1);
    }
    return ans;
  }
}
