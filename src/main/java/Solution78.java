import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by TOM
 * On 2019/10/17 18:39
 */
public class Solution78 {

  public static void main(String[] args) {
    List<List<Integer>> subsets = subsets(new int[]{1, 2, 3});
    System.out.println(subsets);
  }

  public static List<List<Integer>> subsets(int[] nums) {
    Set<Set<Integer>> lists = new HashSet<>();
    stackThis(lists, nums.length, new HashSet<>());
    return null;
  }

  private static void stackThis(Set<Set<Integer>> lists, int length, Set<Integer> stack) {
    if (!(stack.size() == 0)) {
      lists.add(stack);
      return;
    }
    for (int i = 0; i < length; i++) {
      stack.add(i);
      stackThis(lists, length, stack);
      stack.remove(i);
    }
  }
}
