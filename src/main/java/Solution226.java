import baseEntity.TreeNode;

/**
 * Created by TOM
 * On 2023/10/13 16:42
 */
public class Solution226 {

  //反转二叉树
  public TreeNode invertTree(TreeNode root) {
    if (root == null) {
      return null;
    }
    TreeNode left = invertTree(root.left);
    TreeNode right = invertTree(root.right);
    root.left = right;
    root.right = left;
    return root;
  }
}
