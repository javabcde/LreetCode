package dsa;

/**
 * Created by TOM
 * On 2019/10/21 16:28
 */
public class linkedList {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    removeFirst(head);
    System.out.println(head);
  }

  public static void removeFirst(ListNode listNode) {
    ListNode curr = listNode, pre = null;
    while (curr != null) {
      ListNode next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;
    }
    System.out.println(pre);
    /*
        Node curr = list, pre = null;
    while (curr != null) {
      Node next = curr.next;
      curr.next = pre;
      pre = curr;
      curr = next;
    }
    return pre;
     */
  }

}
