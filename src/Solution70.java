/**
 * Created by TOM
 * On 2019/11/24 16:28
 */
public class Solution70 {

  public static void main(String[] args) {
    System.out.println(climbStairs(6));
    System.out.println(climbStairs01(6));
  }

  public static int climbStairs(int n) {
    int[] temp = new int[n + 1];
    temp[0] = 1;
    temp[1] = 1;
    for (int i = 2; i <= n; i++) {
      temp[i] = temp[i - 1] + temp[i - 2];
    }
    return temp[n];
  }

  public static int climbStairs01(int n) {
    int first = 1;
    int two = 1;
    for (int i = 2; i <= n; i++) {
      int end = first + two;
      if (i % 2 == 0) {
        two = end;
      } else {
        first = end;
      }
    }
    return n % 2 == 0 ? two : first;
  }
}
