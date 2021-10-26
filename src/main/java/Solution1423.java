/**
 * Created by TOM
 * On 2020/4/29 14:06
 */
public class Solution1423 {

  public static void main(String[] args) {
    int[] ints = {100, 79, 80, 1, 1, 1, 200, 1};
    System.out.println(maxScore(ints, 3));
  }

  public static int maxScore(int[] cardPoints, int k) {
    int countTemp = 0;
    for (int i = 0; i < k; i++) {
      countTemp += cardPoints[i];
    }
    int kTemp = k;
    int result = countTemp;
    for (int i = cardPoints.length - 1; i >= cardPoints.length - k; i--) {
      countTemp = countTemp - cardPoints[--kTemp] + cardPoints[i];
      if (countTemp > result) {
        result = countTemp;
      }
    }
    return result;
  }
}
