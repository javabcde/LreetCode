/**
 * Created by TOM
 * On 2019/11/27 16:08
 */
public class Solution121 {

  public static void main(String[] args) {
    int[] ints = {7, 1, 5, 3, 6, 4};
    System.out.println(maxProfit(ints));
  }

  public static int maxProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }
    int[][] temp = new int[2][prices.length + 1];
    temp[0][0] = 0;
    temp[1][0] = -prices[0];
    for (int i = 1; i <= prices.length; i++) {
      //没有
      temp[0][i] = Math.max(temp[0][i - 1], temp[1][i - 1] + prices[i - 1]);
      //第i天买了.
      temp[1][i] = Math.max(temp[1][i - 1], -prices[i - 1]);
    }
    return temp[0][prices.length];
  }
}
