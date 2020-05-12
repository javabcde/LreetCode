import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by TOM
 * On 2020/5/12 13:09
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class MinStack {

  /**
   * initialize your data structure here.
   */
  private final ArrayList<Integer> arrayList;

  public MinStack() {
    arrayList = new ArrayList<>();
  }

  public void push(int x) {
    arrayList.add(x);
  }

  public void pop() {
    arrayList.remove(arrayList.size() - 1);
  }

  public int top() {
    return arrayList.get(arrayList.size() - 1);
  }

  public int getMin() {
    return Collections.min(arrayList);
  }
}
