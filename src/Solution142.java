import java.util.HashSet;
import java.util.Set;

/**
 * Created by TOM
 * On 2019/12/26 20:54
 */
public class Solution142 {

  public static void main(String[] args) {

  }

  public ListNode detectCycle(ListNode head) {

    ListNode fast = hasCycle(head);
    if (fast == null) {
      return null;
    }
    //ListNode xiangjiao = fast;
    ListNode headStart = head;
    while (headStart != fast) {
      fast = fast.next;
      headStart = headStart.next;
    }
    return fast;
  }

  public ListNode hasCycle(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode fast, slow;
    fast = slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return fast;
      }
    }
    return null;
  }

  /**
   * 第二种解法
   *
   * @param head
   * @return
   */
  public ListNode detectCycle02(ListNode head) {
    Set<ListNode> listNodeSet = new HashSet<>();
    ListNode index = head;
    while (index != null) {
      if (listNodeSet.contains(index)) {
        return index;
      }
      listNodeSet.add(index);
      index = index.next;
    }
    return null;
  }
}
