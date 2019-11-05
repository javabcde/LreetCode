package dsa;

/**
 * Created by TOM
 * On 2019/10/31 23:53
 */
public class 斐波那契数列 {

  public static void main(String[] args) {
    System.out.println(dp(50));
  }

  public static int dp(int i) {
    if (i == 1) {
      return 1;
    }
    if (i == 2) {
      return 2;
    }
    return dp(i - 1) + dp(i - 2);
  }
}
