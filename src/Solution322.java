import java.util.Arrays;

/**
 * Created by TOM
 * On 2019/11/19 13:55
 */
public class Solution322 {

  public static void main(String[] args) {
    int[] ints = {1, 5, 2};
    System.out.println(coinChange(ints, 11));
  }

  public static int coinChange(int[] coins, int amount) {
    //这个记录当前位置最少需要多少金额
    int[] amountNums = new int[amount + 1];
    Arrays.fill(amountNums, amount + 1);
    //格式化位置0
    amountNums[0] = 0;
    for (int i = 1; i < amountNums.length; i++) {
      for (int j = 0; j < coins.length; j++) {
        if (i - coins[j] >= 0) {
          int sumNum = amountNums[i - coins[j]] + 1;
          if (sumNum < amountNums[i]) {
            amountNums[i] = sumNum;
          }
        }
      }
    }
    return amountNums[amount] <= amount ? amountNums[amount] : -1;
  }
}
