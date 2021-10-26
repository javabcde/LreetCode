import java.util.Arrays;

/**
 * Created by TOM
 * On 2019/12/18 15:22
 */
public class Solution242 {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }
    int[] temp = new int[26];
    Arrays.fill(temp, 0);
    for (int i = 0; i < s.length(); i++) {
      temp[s.charAt(i) - 'a']++;
      temp[t.charAt(i) - 'a']--;
    }
    for (int value : temp) {
      if (value != 0) {
        return false;
      }
    }
    return true;
  }
}
