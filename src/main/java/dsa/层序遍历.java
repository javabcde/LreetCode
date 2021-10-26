package dsa;

import baseEntity.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by TOM
 * On 2020/5/13 19:46
 */
public class 层序遍历 {

  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return new ArrayList<>();
    }
    LinkedList<TreeNode> linkedList = new LinkedList<>();
    linkedList.add(root);
    List<List<Integer>> result = new ArrayList<>();
    while (!linkedList.isEmpty()) {
      int size = linkedList.size();
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < size; i++) {
        TreeNode poll = linkedList.poll();
        if (poll.left != null) {
          linkedList.add(poll.left);
        }
        if (poll.right != null) {
          linkedList.add(poll.right);
        }
        list.add(poll.val);
      }
      result.add(list);
    }
    return result;
  }
}
