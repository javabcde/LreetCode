package dsa;

import com.alibaba.fastjson.JSON;

/**
 * 三个while 和 一个while 的两种写法
 * Created by TOM
 * On 2019/10/24 22:53
 */
public class fastSort {

  public static void main(String[] args) {
    int[] ints = {1, 1, 1, 0, 0, 0, 2, 2, 2, 4, 4, 4, 5, 65, 9, 4, 21, 2, 3};
    fastSort(ints);
    //QuickSort(ints, 0, ints.length - 1);
    System.out.println(JSON.toJSONString(ints));
  }

  public static void fastSort(int[] nums) {
    int length = nums.length;
    //数组 和两个下标
    thisFastSort(nums, 0, length - 1);
  }

  private static void thisFastSort(int[] nums, int start, int end) {
    if (start >= end) {
      return;
    }
    int middle = partition(nums, start, end);
    thisFastSort(nums, start, middle - 1);
    thisFastSort(nums, middle + 1, end);
  }

  private static int partition(int[] nums, int start, int end) {
    //以最后一个数作为标准数
    int pivot = nums[end];
    int i = start;
    int j = start;
    //双指针
    while (j < end) {
      if (nums[j] < pivot) {
        swap(nums, i, j);
        i++;
      }
      j++;
    }
    swap(nums, i, end);
    return i;
  }

  private static void swap(int[] nums, int i, int j) {
    int tmp = nums[i];
    nums[i] = nums[j];
    nums[j] = tmp;
  }

  //====================================================================================

  /**
   * 快速排序（经典快排）
   * ·选取第一个数（或最后一个数）作为基准,把它放在数组的中，数组一分为二，左边的数比它小右边的数比它大
   * ·将左边的部分递归
   * ·将右边的部分递归
   * 有点问题 case:1, 1, 1, 0, 0, 0, 2, 2, 2, 4, 4, 4, 5, 65, 9, 4, 21, 2, 3
   */
  public static void QuickSort(int[] A, int p, int r) {//p,r分别为数组的首元素和尾元素下标
    if (p < r) {
      int q = Partition(A, p, r);//划分数组，找到首元素A[p]在排好序后的位置q q是临界位置 最后需要交换下 将标准值换过去
      swap(A, p, q);
      QuickSort(A, p, q - 1);
      QuickSort(A, q + 1, r);
    }
  }

  /*
    {3,2,1,4,2,9,7,9,8,10}
    输入：数组A[p,r];
    输出:j,A的首元素在排好序的数组中的位置
  */
  public static int Partition(int[] A, int p, int r) {

    int key = A[p];
    int i = p;
    int j = r;
    while (i < j) {
      /*从左向右遍历 比key小的话 直接下标加一空过key  直到遇到比key大的 更新i坐标*/
      while (A[i] <= key) {
        i = i + 1;
      }
      /*从右向左遍历 比key大的话 直接下标减一空过key 直到遇到比key小的 更新j坐标 不更新数字*/
      while (A[j] > key) {
        j = j - 1;
      }
      if (i < j) {
        //交换左右下标的数字
        swap(A, i, j);
      }
    }
    //首元素A[p]在排好序后的位置j
    return j;
  }
}
