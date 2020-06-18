import baseEntity.ListNode;

/**
 * Created by TOM
 * On 2020/6/18 10:36
 */
public class Solution328 {

  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode odd = head, even = head.next, evenHead = even;
    while (even != null && even.next != null) {
      //偶数后面是奇数
      odd.next = even.next;
      //将奇数更新odd
      odd = odd.next;
      //将上一个奇数后面的偶数 更新到上一个偶数的后面
      even.next = odd.next;
      //将偶数更新到even
      even = even.next;
    }
    //连接奇偶链表
    odd.next = evenHead;
    return head;
  }
}
