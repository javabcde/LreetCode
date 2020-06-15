/**
 * Created by TOM
 * On 2020/6/15 10:13
 */
public class Solution14 {


  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 1) {
      return strs[0];
    }
    String result = "";
    if (strs.length == 0) {
      return result;
    }
    String first = strs[0];
    for (int i = 1; i < strs.length; i++) {
      int minLength = Math.min(first.length(), strs[i].length());
      int index = 0;
      while (index < minLength && (first.charAt(index) == strs[i].charAt(index))) {
        index++;
      }
      result = first.substring(0, index);
      first = result;
      if (result.length() == 0) {
        break;
      }
    }
    return result;
  }
}
