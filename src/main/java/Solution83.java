import baseEntity.ListNode;

/**
 * Created by TOM
 * On 2019/10/16 14:23
 */
public class Solution83 {

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(1);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(2);
    ListNode listNode1 = deleteDuplicates(head);
    System.out.println(listNode1);
  }

  public static ListNode deleteDuplicates(ListNode head) {
    ListNode listNode = head;
    while (listNode != null) {
      if (listNode.next == null) {
        break;
      }
      if (listNode.val == listNode.next.val) {
        //引用跳到下下个
        listNode.next = listNode.next.next;
      } else {
        //指针前移动
        listNode = listNode.next;
      }
    }
    return head;
  }
}
