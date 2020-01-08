import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2020/1/8 16:26
 */
public class Solution145 {

  public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    stackThis(result, root);
    return result;
  }

  private void stackThis(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }
    stackThis(result, root.left);
    stackThis(result, root.right);
    result.add(root.val);
  }
}
