/**
 * Created by TOM
 * On 2020/12/10 9:07
 */
public class Solution860 {

  public static void main(String[] args) {

  }

  public boolean lemonadeChange(int[] bills) {
    int five = 0, ten = 0;
    for (int bill : bills) {
      if (bill == 5) {
        five++;
        continue;
      }
      if (bill == 10) {
        //用个五块的
        if (--five < 0) {
          return false;
        }
        //加个十块的
        ten++;
        continue;
      }
      if (ten != 0) {
        if (five == 0) {
          return false;
        } else {
          ten--;
          five--;
        }
      } else if (five >= 3) {
        //只有五块的情况
        five = five - 3;
      } else {
        return false;
      }
    }
    return true;
  }
}
