import baseEntity.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2020/1/8 14:37
 */
public class Solution144 {


  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    statckThis(result, root);
    return result;
  }

  private void statckThis(List<Integer> result, TreeNode root) {
    if (root == null) {
      return;
    }
    result.add(root.val);
    statckThis(result, root.left);
    statckThis(result, root.right);
  }
}
