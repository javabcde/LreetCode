/**
 * Created by TOM
 * On 2019/10/18 10:50
 */
public class 冒泡排序 {

  public static void main(String[] args) {
    bubbleSort(new int[]{10, 5, 3, 4, 5, 9, 10, 5, 4});
  }

  // 冒泡排序，a 表示数组，n 表示数组大小
  public static void bubbleSort(int[] a) {
    int n = a.length;
    if (n <= 1) {
      return;
    }

    for (int i = 0; i < n; ++i) {
      // 提前退出冒泡循环的标志位
      boolean flag = false;
      for (int j = 0; j < n - i - 1; ++j) {
        if (a[j] > a[j + 1]) { // 交换
          int tmp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = tmp;
          flag = true;  // 表示有数据交换
        }
      }
      if (!flag) {
        break;  // 没有数据交换，提前退出
      }
    }
    System.out.println(a);
  }

}
