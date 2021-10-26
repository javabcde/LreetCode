import baseEntity.ListNode;

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
    ListNode pre = new ListNode(0);
    pre.next = head;
    ListNode temp = pre;
    while (temp.next != null && temp.next.next != null) {
      ListNode start = temp.next;
      ListNode end = temp.next.next;
      temp.next = end;
      start.next = end.next;
      end.next = start;
      temp = start;
    }
    return pre.next;
  }

  public ListNode swapPairsA(ListNode head) {

    // If the list has no node or has only one node left.
    if ((head == null) || (head.next == null)) {
      return head;
    }

    // Nodes to be swapped
    ListNode firstNode = head;
    ListNode secondNode = head.next;

    // Swapping
    firstNode.next = swapPairsA(secondNode.next);
    secondNode.next = firstNode;

    // Now the head is the second node
    return secondNode;
  }
}
