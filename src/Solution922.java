/**
 * Created by TOM
 * On 2020/11/12 18:27
 */
public class Solution922 {

  public static void main(String[] args) {

  }

  public int[] sortArrayByParityII(int[] A) {
    int j = 1;
    for (int i = 0; i < A.length; i += 2) {
      if (A[i] % 2 != 0) {
        while (A[j] % 2 != 0) {
          j += 2;
        }
        //swap
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
      }
    }
    return A;
  }
}
