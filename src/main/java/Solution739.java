import com.alibaba.fastjson.JSON;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by TOM
 * On 2021/10/27 22:12
 */
public class Solution739 {

  public static void main(String[] args) {
    System.out.println(JSON.toJSONString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
  }

  public static int[] dailyTemperatures(int[] temperatures) {
    int[] reslt = new int[temperatures.length];

    Deque<Integer> stack = new ArrayDeque<>();
    for (int i = temperatures.length - 1; i >= 0; i--) {
      while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
        stack.pop();
      }
      reslt[i] = stack.isEmpty() ? 0 : stack.peek() - i;
      stack.push(i);
    }
    return reslt;
  }
}
