import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2020/12/7 18:28
 */
public class Solution118 {

  public static void main(String[] args) {
    
  }

  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    int[][] arr = new int[numRows][numRows];
    for (int i = 0; i < numRows; i++) {
      List<Integer> subList = new ArrayList<>();
      for (int j = 0; j <= i; j++) {
        if (j == 0 || j == i) {
          arr[i][j] = 1;
        } else {
          arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
        }
        subList.add(arr[i][j]);
      }
      list.add(subList);
    }
    return list;
  }
}
