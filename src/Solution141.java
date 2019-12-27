/**
 * Created by TOM
 * On 2019/12/26 20:05
 */
public class Solution141 {

  public static void main(String[] args) {

  }

  public boolean hasCycle(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode fast, slow;
    fast = slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        return true;
      }
    }
    return false;
  }
}
