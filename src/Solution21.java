/**
 * Created by TOM
 * On 2019/10/15 10:39
 */
public class Solution21 {

  public static void main(String[] args) {

  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode virNode = new ListNode(0);
    ListNode tihuan = virNode;//这个为了替换
    while (l1 != null && l2 != null) {
      if (l1.val < l2.val) {
        tihuan.next = l1;
        l1 = l1.next;
      } else {
        tihuan.next = l2;
        l2 = l2.next;
      }
      tihuan = tihuan.next;
    }
    //这时候说明肯定有一个为空
    if (l1 != null) {
      tihuan.next = l1;
    }
    if (l2 != null) {
      tihuan.next = l2;
    }
    return virNode.next;
  }

  private static class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
