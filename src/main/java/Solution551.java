/**
 * Created by TOM
 * On 2020/11/18 14:00
 */
public class Solution551 {

  public static void main(String[] args) {
    System.out.println(checkRecord("AA"));
  }

  public static boolean checkRecord(String s) {
    //记录联系L数量 和 A的数量
    int Acount = 0;
    for (int i = 0; i < s.length(); i++) {
      if (Acount > 2) {
        return false;
      }
      if (s.charAt(i) == 'A') {
        Acount++;
      }
    }
    return Acount < 2 && !s.contains("LLL");
  }
}
