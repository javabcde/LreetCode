/**
 * Created by TOM
 * On 2020/4/30 10:06
 */
public class Solution202 {


  public static void main(String[] args) {
    System.out.println(isHappy(3));
  }

  /**
   * 双指针
   */
  public static boolean isHappy(int n) {
/*    int slowRunner = n;
    int fastRunner = getSum(n);
    while (fastRunner != 1 && slowRunner != fastRunner) {
      slowRunner = getSum(slowRunner);
      fastRunner = getSum(getSum(fastRunner));
    }
    return fastRunner == 1;*/
    int fast = getSum(n);
    int slow = n;
    while (fast != 1 && fast != slow) {
      slow = getSum(slow);
      fast = getSum(getSum(fast));
    }
    return fast == 1;
  }


/*  public static boolean isHappy(int n) {
    HashSet<Integer> hashSet = new HashSet<>();
    while (n != 1 && !hashSet.contains(n)) {
      hashSet.add(n);
      n = getSum(n);
    }
    return n == 1;
  }*/

  private static int getSum(int n) {
    int sum = 0;
    while (n > 0) {
      int num = n % 10;
      n = n / 10;
      sum += num * num;
    }
    return sum;
  }
}
