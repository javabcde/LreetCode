import baseEntity.ListNode;

/**
 * Created by TOM
 * On 2019/10/16 16:37
 */
public class Solution206 {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    ListNode listNode1 = reverseList(head);
    System.out.println(listNode1);
  }

  public static ListNode reverseList(ListNode head) {
    ListNode curr = head;
    ListNode pre = null;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;
    }
    return pre;
  }
}
