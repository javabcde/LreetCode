import java.util.Stack;

/**
 * 这个题没有写出来....
 * Created by TOM
 * On 2019/12/4 15:56
 */
public class Solution32 {

  public static void main(String[] args) {
    System.out.println(longestValidParentheses0(")()())"));
    System.out.println(longestValidParentheses("()(())"));
  }

  /**
   * @param s
   * @return
   */
  public static int longestValidParentheses(String s) {
    Stack<Integer> sIndex = new Stack<>();
    int maxLen = 0;
    sIndex.push(-1);
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '(') {
        sIndex.push(i);
      } else {
        sIndex.pop();
        if (sIndex.empty()) {
          sIndex.push(i);
        } else {
          maxLen = Math.max(maxLen, i - sIndex.peek());
        }
      }
    }
    return maxLen;
  }

  /**
   * 这个理解错题目了,坑, 求得有效括号的个数
   *
   * @param s
   * @return
   */
  public static int longestValidParentheses0(String s) {
    char[] chars = s.toCharArray();
    if (chars.length == 1 || chars.length == 0) {
      return 0;
    }
    Stack<Character> stack = new Stack<>();
    stack.push(chars[0]);
    int count = 0;
    for (int i = 1; i < chars.length; i++) {
      if (stack.empty()) {
        stack.push(chars[i]);
        continue;
      }
      if (i <= chars.length - 1 && stack.peek().equals('(') && chars[i] == ')') {
        stack.pop();
        count++;
      } else {
        stack.push(chars[i]);
        count = 0;
      }
    }
    return count * 2;
  }
}
