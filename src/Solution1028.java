import baseEntity.TreeNode;

/**
 * Created by TOM
 * On 2020/6/18 10:26
 */
public class Solution1028 {

  int pos = 0;
  int posDpt = 0;
  int posNum = 0;

  public TreeNode recoverFromPreorder(String S) {
    int num = 0;
    while (pos < S.length() && S.charAt(pos) != '-') {
      num = num * 10 + S.charAt(pos) - '0';
      pos++;
    }
    if (pos >= S.length()) {
      return new TreeNode(num);
    }
    TreeNode ans = helper(new TreeNode(num), 0, S);
    return ans;
  }

  public TreeNode helper(TreeNode cur, int curDepth, String S) {
    if (pos >= S.length()) {
      pos++;  //防止最后一个节点多次连接
      return new TreeNode(posNum);
    }
    int dpt = 0, num = 0;
    while (pos < S.length() && S.charAt(pos) == '-') {
      dpt++;
      pos++;
    }
    while (pos < S.length() && S.charAt(pos) != '-') {
      num = num * 10 + S.charAt(pos) - '0';
      pos++;
    }
    //全局变量记录当前pos节点的深度和数值
    posDpt = dpt;
    posNum = num;
    //当下一个节点（pos）的深度比自己（cur）大时，递归的构造左节点。
    if (posDpt > curDepth) {
      cur.left = helper(new TreeNode(posNum), dpt, S);
    }
    //当下一个节点的深度<=自己的深度时，说明自己不是其父节点，返回。
    if (posDpt <= curDepth) {
      return cur;
    }
    //能到达这里，说明pos位置节点的深度比当前cur的深度大，且cur的左节点已赋值
    if (pos <= S.length()) {
      cur.right = helper(new TreeNode(posNum), dpt, S);
    } else {
      cur.right = null;   //其余情况均为null
    }

    return cur;
  }
}
