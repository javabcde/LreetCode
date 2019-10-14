import java.util.Stack;

/**
 * Created by TOM
 * On 2019/10/14 20:07
 */
public class Solution20 {

  public static void main(String[] args) {
    boolean valid = isValid("");
    System.out.println(valid);
  }

  public static boolean isValid(String s) {
    if (s.length() == 0) {
      return true;
    }
    String[] split = s.split("");
    if (split.length % 2 != 0) {
      return false;
    }
    Stack<String> stack = new Stack<>();
    for (String s1 : split) {
      if (stack.size() == 0) {
        stack.push(s1);
      } else if (checkChar(stack.peek(), s1)) {
        stack.pop();
      } else {
        stack.push(s1);
      }
    }
    return stack.empty();
  }

  private static boolean checkChar(String peek, String s1) {
    return (peek.equals("[") && s1.equals("]")) || (peek.equals("(") && s1.equals(")")) || (peek.equals("{") && s1
        .equals("}"));
  }
}
