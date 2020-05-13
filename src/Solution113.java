import baseEntity.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 查找叶子节点
 * Created by TOM
 * On 2019/10/18 18:07
 */
public class Solution113 {

  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> lists = new ArrayList<>();
    getSum(lists, root, sum, 0, new Stack<>());
    return lists;
  }

  private void getSum(List<List<Integer>> lists, TreeNode root, int sum, int currSum, Stack<Integer> objects) {
    if (root == null) {
      return;
    }
    currSum += root.val;
    objects.push(root.val);
    if (root.left == null && root.right == null) {
      if (currSum == sum) {
        lists.add(new ArrayList<>(objects));
      }
      objects.pop();
      return;
    }
    getSum(lists, root.left, sum, currSum, objects);
    getSum(lists, root.right, sum, currSum, objects);
    //都找完了 删除最后一个节点
    objects.pop();
  }
}
