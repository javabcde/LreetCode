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

  //优化
  public static int lengthOfLongestSubstring(String s) {
    if (s.equals("")) {
      return 0;
    }
    if (s.length() == 1) {
      return 1;
    }
    //String[] split = s.split("");
    Set<Character> stringSet = new HashSet<>();
    int fast = 0;
    int slow = 0;
    int length = 0;
    while (fast < s.length()) {
      if (!stringSet.contains(s.charAt(fast))) {
        stringSet.add(s.charAt(fast));
        fast++;
        length = Math.max(length, stringSet.size());
      } else {
        //已经出现过了 将左边界删除一个
        stringSet.remove(s.charAt(slow));
        slow++;
      }
    }
    return length;
  }

/*  public static int lengthOfLongestSubstring(String s) {
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
        length = Math.max(length, stringSet.size());
      } else {
        //已经出现过了 将左边界删除一个
        stringSet.remove(split[slow]);
        slow++;
      }
    }
    return length;
  }*/
}
