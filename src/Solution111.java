import baseEntity.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by TOM
 * On 2019/11/4 23:00
 */
public class Solution111 {

  public static void main(String[] args) {
    TreeNode root = new TreeNode(5);
    root.right = new TreeNode(9);
    root.left = new TreeNode(20);
    int i = minDepth(root);
    System.out.println(i);
  }

  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int deep = 0;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      deep++;
      for (int i = 0; i < levelSize; i++) {
        TreeNode poll = queue.poll();
        if (poll.left == null && poll.right == null) {
          return deep;
        }
        if (poll.right != null) {
          queue.add(poll.right);
        }
        if (poll.left != null) {
          queue.add(poll.left);
        }
      }
    }
    return deep;
  }
}
