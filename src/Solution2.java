/**
 * 没读懂题 先不写了
 * Created by TOM
 * On 2019/10/16 13:55
 */
public class Solution2 {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(2);
    ListNode head = new ListNode(1);
    head.next = listNode;
    ListNode listNode1 = addTwoNumbers(head, head);
    System.out.println(listNode1);
  }

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode vir = new ListNode(0);
    ListNode head = vir;
    while (l1 != null && l2 != null) {
      head.next = new ListNode(l1.val + l2.val);
      head = head.next;
      l1 = l1.next;
      l2 = l2.next;
    }
    return vir.next;
  }
}
