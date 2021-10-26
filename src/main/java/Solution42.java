/**
 * 这也能叫困难题???
 * Created by TOM
 * On 2019/11/29 15:48
 */
public class Solution42 {

  public static void main(String[] args) {
    int[] ints = {0, 1, 0, 2, 1, 4, 1, 3, 8, 1, 2, 5};
    System.out.println(trap(ints));
  }


  public static int trap(int[] height) {
    int max = 0;
    int tempJ = 0;
    for (int i = 1; i < height.length - 1; i++) {
      int lMax = 0, rMax = 0;
      for (int j = tempJ; j < i; j++) {
        lMax = Math.max(lMax, height[j]);
      }
      if (lMax < height[i]) {
        tempJ = i;
        continue;
      }
      for (int k = height.length - 1; k > i; k--) {
        rMax = Math.max(rMax, height[k]);
      }
      if (rMax < height[i]) {
        continue;
      }
      max += Math.min(lMax, rMax) - height[i];
    }
    return max;
  }
}
