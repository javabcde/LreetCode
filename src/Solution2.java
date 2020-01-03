/**
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
    int addNum = 0;
    while ((l1 != null || l2 != null)) {
      int l1Int = l1 != null ? l1.val : 0;
      int l2Int = l2 != null ? l2.val : 0;

      int i = l1Int + l2Int + addNum;
      head.next = new ListNode(i % 10);
      addNum = i / 10;
      head = head.next;
      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (addNum > 0) {
      head.next = new ListNode(addNum);
    }
    return vir.next;
  }
}
