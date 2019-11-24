package dsa;

/**
 * Created by TOM
 * On 2019/10/31 23:53
 */
public class 斐波那契数列 {

  public static void main(String[] args) {
    //System.out.println(dp(50));
    System.out.println(dp1(50));
  }

  /*
   递归
   */
  public static int dp(int i) {
    if (i == 1) {
      return 1;
    }
    if (i == 2) {
      return 1;
    }
    return dp(i - 1) + dp(i - 2);
  }

  /*
  动态规划.
   */
  public static int dp1(int i) {
    int[] temp = new int[i + 1];
    temp[0] = 0;
    temp[1] = 1;
    temp[2] = 1;
    for (int j = 3; j <= i; j++) {
      temp[j] = temp[j - 1] + temp[j - 2];
    }
    return temp[i];
  }
}
