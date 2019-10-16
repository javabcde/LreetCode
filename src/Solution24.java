/**
 * 需要链表反转
 * Created by TOM
 * On 2019/10/16 15:21
 */
public class Solution24 {

  //[1,2,3,4,5]
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    ListNode listNode = swapPairs(head);
    System.out.println(listNode);
  }

  public static ListNode swapPairs(ListNode head) {
    ListNode vir = new ListNode(0);
    ListNode p = vir;
    ListNode fast = head.next;
    ListNode slow = head;
    while (fast != null) {
      p = fast;
      p.next = slow;
      fast = fast.next.next;
      slow = slow.next.next;
    }
    return vir.next;
  }
}
