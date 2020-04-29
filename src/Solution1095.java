/**
 * Created by TOM
 * On 2020/4/29 10:49
 */
public class Solution1095 {

  public static void main(String[] args) {

  }

  public static int findPeak(MountainArray mountainArr) {
    int n = mountainArr.length();
    int left = 0, right = n - 1;
    while (left <= right) {
      int mid = left + (right - left) / 2;
      int x = mountainArr.get(mid);
      if (x > mountainArr.get(mid + 1)) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return left;
  }

  public static int findInMountainArray(int target, MountainArray mountainArr) {
    int peak = findPeak(mountainArr);
    int erfen = erfenLeft(mountainArr, 0, peak, target);
    if (erfen < 0) {
      erfen = erfenRight(mountainArr, peak + 1, mountainArr.length() - 1, target);
    }
    return erfen;
  }

  private static int erfenRight(MountainArray mountainArray, int left, int right, int target) {
    while (left <= right) {
      int middle = left + ((right - left) >> 1);
      if (target == mountainArray.get(middle)) {
        return middle;
      } else if (target < mountainArray.get(middle)) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }
    return -1;
  }

  //因为右边是倒序
  public static int erfenLeft(MountainArray mountainArray, int left, int right, int target) {
    while (left <= right) {
      int middle = left + ((right - left) >> 1);
      if (target == mountainArray.get(middle)) {
        return middle;
      } else if (target < mountainArray.get(middle)) {
        right = middle - 1;
      } else {
        left = middle + 1;
      }
    }
    return -1;
  }
}
