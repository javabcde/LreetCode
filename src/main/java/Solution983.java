/**
 * 没写出来 别人的答案
 * Created by TOM
 * On 2020/5/6 23:22
 */
public class Solution983 {

  /**
   * 作者：eddieVim
   * 链接：https://leetcode-cn.com/problems/minimum-cost-for-tickets/solution/dong-tai-gui-hua-jie-ti-xiang-xi-zhu-shi-by-eddiev/
   * 来源：力扣（LeetCode）
   * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
   *
   * @param days
   * @param costs
   * @return
   */
  public int mincostTickets(int[] days, int[] costs) {
    //判断
    if (days == null || days.length == 0 ||
        costs == null || costs.length == 0) {
      return 0;
    }

    //dp表示到了当天花的最低票价 dp代表了天数 一个空格是一天
    int[] dp = new int[days[days.length - 1] + 1];

    //base case: 第0天一定不用买票 则花费0元
    dp[0] = 0;
    //标记一下需要买票的日子
    for (int day : days) {
      dp[day] = Integer.MAX_VALUE;
    }

    for (int i = 1; i < dp.length; i++) {
      //i: 这个月的第几天
      //不需要买票
      if (dp[i] == 0) {
        //不需要买票花费的钱就是前一天的花费
        dp[i] = dp[i - 1];
        continue;
      }
      //三种情况
      //当天需要买票
      int n1 = dp[i - 1] + costs[0];
      /* 如果今天距离第一天已经超过7天了
       * 则花费: dp[i-7](7天前已经花费的钱)+cost[1](7天前买了一张7天的票) 算最少的花费
       * 否则就是直接第一天买了一张7天票
       */
      int n2 = i > 7 ? dp[i - 7] + costs[1] : costs[1];
      //30天与7天 同理
      int n3 = i > 30 ? dp[i - 30] + costs[2] : costs[2];

      dp[i] = Math.min(n1, Math.min(n2, n3));
    }
    //最后一天花费多少钱
    return dp[days[days.length - 1]];
  }
}
