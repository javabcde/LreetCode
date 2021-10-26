package dsa;

/**
 * Created by TOM
 * On 2019/10/21 11:40
 */
public class 递归 {

  public static void main(String[] args) {
    int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    ReverseArray(ints, 0, ints.length - 1);
    System.out.println(ints);
  }

  public static void ReverseArray(int[] a, int lo, int hi) {
    if (lo < hi) {
      int tmp;
      tmp = a[lo];
      a[lo] = a[hi];
      a[hi] = tmp;
      ReverseArray(a, lo + 1, hi - 1);
    }
  }
}
