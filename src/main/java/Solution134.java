/**
 * Created by TOM
 * On 2020/11/18 9:44
 */
public class Solution134 {

  public int canCompleteCircuit(int[] gas, int[] cost) {
    int start = 0, run = 0, rest = 0;
    for (int i = 0; i < gas.length; i++) {
      run += gas[i] - cost[i];
      //记录一下能否走完全程总和
      rest += gas[i] - cost[i];
      if (run < 0) {
        //当前位置走不完 +1继续走
        start = i + 1;
        run = 0;
      }
    }
    return rest >= 0 ? start : -1;
  }
}
