/**
 * Created by TOM
 * On 2019/11/24 17:13
 */
public class Solution509 {

  public static void main(String[] args) {
    System.out.println(fib(0));
  }

  public static int fib(int N) {
    if (N == 0) {
      return N;
    }
    int[] temp = new int[N + 1];
    temp[0] = 0;
    temp[1] = 1;
    for (int i = 2; i <= N; i++) {
      temp[i] = temp[i - 1] + temp[i - 2];
    }
    return temp[N];
  }
}
