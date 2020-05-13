import baseEntity.ListNode;

/**
 * Created by TOM
 * On 2019/11/28 17:08
 */
public class Solution92 {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    //removeFirst(head);
    reverseBetween(head, 2, 4);
    System.out.println(head);
  }

  public static ListNode reverseBetween(ListNode head, int m, int n) {
    if (m == 1) {
      return reverse(head, n);
    }
    head.next = reverseBetween(head.next, m - 1, n - 1);
    return head;
  }


  private static ListNode qianyige = null;

  private static ListNode reverse(ListNode head, int n) {
    if (n == 1) {
      qianyige = head.next;
      return head;
    }
    ListNode last = reverse(head.next, n - 1);
    head.next.next = head;
    head.next = qianyige;
    return last;
  }
}
