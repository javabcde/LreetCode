/**
 * Created by TOM
 * On 2020/11/12 10:55
 */
public class Solution11 {

  public static void main(String[] args) {

  }

  /**
   * 就是低*高
   *
   * @param height
   * @return
   */
  public int maxArea(int[] height) {
    int i = 0, j = height.length - 1, areaMax = 0;
    while (i < j) {
      if (height[i] > height[j]) {
        areaMax = Math.max(areaMax, height[j] * (j - i));
        j--;
      } else {
        areaMax = Math.max(areaMax, height[i] * (j - i));
        i++;
      }
    }
    return areaMax;
  }
}
