/**
 * Created by TOM
 * On 2020/1/8 17:13
 */
public class Solution104 {

  private int result;

  public int maxDepth(TreeNode root) {
    stackThis(root, 1);
    return result;
  }

  private void stackThis(TreeNode root, int level) {
    if (root == null) {
      return;
    }
    result = Math.max(result, level);
    stackThis(root.left, level + 1);
    stackThis(root.right, level + 1);
  }
}
