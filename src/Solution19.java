import baseEntity.ListNode;

/**
 * Created by TOM
 * On 2019/10/14 18:04
 */
public class Solution19 {

  public static void main(String[] args) {
    ListNode listNode = new ListNode(2);
    ListNode head = new ListNode(1);
    head.next = listNode;
    //baseEntity.ListNode listNode1 = removeNthFromEnd(head, 2);
    ListNode listNode2 = removeNthFromEnd2(head, 1);
    System.out.println(listNode2);
  }

  /**
   * 一次遍历删除
   * 双指针
   */
  private static ListNode removeNthFromEnd2(ListNode head, int i) {
    ListNode vir = new ListNode(0);
    vir.next = head;
    ListNode first = vir;
    ListNode sec = vir;

    for (int i1 = 0; i1 <= i; i1++) {
      //移动n+1
      first = first.next;
    }
    while (first != null) {
      first = first.next;
      sec = sec.next;
    }
    sec.next = sec.next.next;
    return vir.next;
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next == null && n == 1) {
      return null;
    }
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    int length = 0;
    ListNode first = head;
    while (first != null) {
      length++;
      first = first.next;
    }
    length -= n;
    first = dummy;
    while (length > 0) {
      length--;
      first = first.next;
    }
    first.next = first.next.next;
    return dummy.next;
  }
}
