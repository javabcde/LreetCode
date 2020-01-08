import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历
 * Created by TOM
 * On 2020/1/8 15:35
 */
public class Solution94 {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    stackThis(result, root);
    return result;
  }

  private void stackThis(List<Integer> result, TreeNode root) {
    if (root != null) {
      if (root.left != null) {
        stackThis(result, root.left);
      }
      result.add(root.val);
      if (root.right != null) {
        stackThis(result, root.right);
      }
    }
  }
}
