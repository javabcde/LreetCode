/**
 * Created by TOM
 * On 2019/11/4 22:33
 */
public class Solution101 {


  public boolean isSymmetric(TreeNode root) {
    return statckThis(root, root);
  }

  private boolean statckThis(TreeNode right, TreeNode left) {
    if (right == null && left == null) {
      return true;
    }
    if (right == null || left == null) {
      return false;
    }
    return (right.val == left.val)
        && (statckThis(right.right, left.left))
        && (statckThis(left.right, right.left));
  }
}
