import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by TOM
 * On 2019/11/4 23:46
 */
public class Solution102 {

  public static void main(String[] args) {
    TreeNode treeNode = new TreeNode(5);
    levelOrder(treeNode);
  }

  public static List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> result = new ArrayList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      List<Integer> ceng = new ArrayList<>();
      int levelSize = queue.size();
      for (int i = 0; i < levelSize/*不能用这个 因为每次都会重新计算size queue.size()*/; i++) {
        TreeNode head = queue.poll();
        if (head.left != null) {
          queue.add(head.left);
        }
        if (head.right != null) {
          queue.add(head.right);
        }
        ceng.add(head.val);
      }
      result.add(ceng);
    }
    return result;
  }

}
