import java.util.Arrays;

/**
 * Created by TOM
 * On 2022/12/12 20:04
 */
public class Solution1781 {

  public int beautySum(String s) {
    int[] arr = new int[26];
    int n = s.length();
    int res = 0;
    for(int i = 0; i < n - 1; i ++){
      Arrays.fill(arr,0);
      for(int j = i; j < n; j ++){
        arr[((int)s.charAt(j)) - 'a'] ++;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int value : arr) {
          if (value > 0) {
            min = Math.min(min, value);
            max = Math.max(max, value);
          }
        }
        res += max - min;
      }
    }
    return res;
  }
}
