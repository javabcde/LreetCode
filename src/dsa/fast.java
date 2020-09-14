package dsa;

import java.util.HashSet;

/**
 * Created by TOM
 * On 2020/9/6 14:36
 */
public class fast {

  public static void main(String[] args) {
    int[] arr = new int[]{1, 2, 3, 4, 9, 5, 6, 8};
    fastSort2(arr, 0, arr.length - 1);
    System.out.println(arr);
  }

  private static void fastSort2(int[] arr, int low, int high) {
    int i, j, temp, t;
    if (low > high) {
      return;
    }
    i = low;
    j = high;

    temp = arr[low];
    while (i < j) {
      while (temp <= arr[j] && i < j) {
        j--;
      }
      while (temp >= arr[i] && i < j) {
        i++;
      }
      if (i < j) {
        t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
      }
    }
    arr[low] = arr[i];
    arr[i] = temp;
    fastSort2(arr, low, j - 1);
    fastSort2(arr, j + 1, high);
  }


  private static ListNode findMenkou(ListNode listNode) {
    HashSet<ListNode> listNodeSet = new HashSet<>();
    while (listNode != null) {
      if (listNodeSet.contains(listNode)) {
        return listNode;
      }
      if (!listNodeSet.contains(listNode)) {
        listNodeSet.add(listNode.next);
        listNode = listNode.next;
      }
    }
    return null;
  }
}
