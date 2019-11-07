/**
 * Created by TOM
 * On 2019/11/7 11:03
 */
public class Solution122 {

  public static void main(String[] args) {
    int[] ints = {1, 1, 0};
    System.out.println(maxProfit(ints));
  }

  public static int maxProfit(int[] prices) {
    //顺序先找数组最小的 再找最大的
    if (prices.length == 0) {
      return 0;
    }
    int i = 0;
    int valley = prices[0];
    int peak = prices[0];
    int maxprofit = 0;
    while (i < prices.length - 1) {
      while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
        i++;
      }
      valley = prices[i];
      while (i < prices.length - 1 && prices[i] <= prices[i + 1]) {
        i++;
      }
      peak = prices[i];
      maxprofit += peak - valley;
    }
    return maxprofit;
  }

  public int max(int[] prices) {
    int maxprofit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] > prices[i - 1]) {
        maxprofit += prices[i] - prices[i - 1];
      }
    }
    return maxprofit;
  }
}
