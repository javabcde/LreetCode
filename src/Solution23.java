import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by TOM
 * On 2020/4/26 10:06
 */
public class Solution23 {

  public static void main(String[] args) {

  }

  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> small = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
    for (ListNode list : lists) {
      if (list != null) {
        small.add(list);
      }
    }
    ListNode listNode = new ListNode(-1);
    ListNode curr = listNode;
    while (small.size() > 0) {
      ListNode poll = small.poll();
      curr.next = poll;
      curr = curr.next;
      if (poll.next != null) {
        small.add(poll.next);
      }
    }
    //断掉引用
    curr.next = null;
    return listNode.next;
  }
}
