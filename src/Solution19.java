/**
 * Created by TOM
 * On 2019/10/14 18:04
 */
public class Solution19 {

  public static void main(String[] args) {

  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
    if (head.next != null) {
      removeNthFromEnd(head.next, n);
    }
    return head;
  }

  private static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
