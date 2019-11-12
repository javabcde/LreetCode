import java.util.HashSet;
import java.util.Set;

/**
 * Created by TOM
 * On 2019/11/7 19:06
 */
public class Solution3 {

  public static void main(String[] args) {
    String s = "abcbcde";
    System.out.println(lengthOfLongestSubstring(s));
  }

  public static int lengthOfLongestSubstring(String s) {
    if (s.equals("")) {
      return 0;
    }
    if (s.length() == 1) {
      return 1;
    }
    String[] split = s.split("");
    Set<String> stringSet = new HashSet<>();
    int fast = 0;
    int slow = 0;
    int length = 0;
    while (fast < split.length) {
      if (!stringSet.contains(split[fast])) {
        stringSet.add(split[fast]);
        fast++;
        if (stringSet.size() > length) {
          length = stringSet.size();
        }
      } else {
        stringSet.remove(split[slow]);
        slow++;
      }
    }
    return length;
  }
}
