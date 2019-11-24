package dsa;

/**
 * Created by TOM
 * On 2019/11/13 16:11
 */
public class 动态规划 {

  public static void main(String[] args) {
    int[] ints = {1, 2, 5, 10};
    System.out.println(baggage01(ints, 9));
    System.out.println(baggage01OneArray(ints, 9));
  }

  /**
   * 简单的背包问题吧 只算重量 没有价值
   *
   * @param weights 物品的重量
   * @param target  目标重量
   */
  public static int baggage01(int[] weights, int target) {
    //物品的数量
    int nums = weights.length;
    //x,y起始为0
    boolean[][] status = new boolean[nums][target + 1];
    //初始化0,0
    status[0][0] = true;
    if (weights[0] < target) {
      status[0][weights[0]] = true;
    }
    //第一个已经放进去了 所以从第二个开始
    for (int i = 1; i < nums; i++) {
      for (int j = 0; j <= target; j++) {
        //垂直方向 上一个位置
        if (status[i - 1][j]) {
          status[i][j] = status[i - 1][j];
        }
      }
      //这个会重复计算 优化下 从后向前算
/*      for (int j = 0; j <= target - weights[i]; j++) {
        if (status[i - 1][j]) {
          //把当前重量算上 这么循环是为了获取最大的值 上一步已有的条件延申一个最大值
          status[i][j + weights[i]] = true;
        }
      }*/
      for (int j = target - weights[i]; j >= 0; j--) {
        if (status[i - 1][j]) {
          status[i][j + weights[i]] = true;
        }
      }
    }
    for (int i = target; i >= 0; i--) {
      //输出最后一行
      if (status[nums - 1][i]) {
        return i;
      }
    }
    return -1;
  }

  //觉得可以简写
  public static int baggage01OneArray(int[] weights, int target) {
    int nums = weights.length;
    boolean[] status = new boolean[target + 1];
    //重量
    status[0] = true;
    if (weights[0] <= target) {
      status[weights[0]] = true;
    }
    for (int i = 1; i < nums; i++) {
      for (int j = target - weights[i]; j >= 0; j--) {
        if (status[j]) {
          status[j + weights[i]] = true;
        }
      }
    }
    for (int i = status.length - 1; i >= 0; i--) {
      if (status[i]) {
        return i;
      }
    }
    return -1;
  }

}
