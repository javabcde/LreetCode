import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2019/10/17 16:50
 */
public class Solution39 {

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<>();
    stackThis(result, candidates, target, new ArrayList<>(), 0);
    return result;
  }

  private void stackThis(List<List<Integer>> result, int[] candidates, int target, ArrayList<Integer> innerList, int layer) {
    if (candidates.length == layer) {
      //应对极限的时候
      return;
    }
    if (target == 0) {
      result.add(new ArrayList<>(innerList));
      return;
    }
    stackThis(result, candidates, target, innerList, layer + 1);
    if (target - candidates[layer] >= 0) {
      innerList.add(candidates[layer]);
      stackThis(result, candidates, target - candidates[layer], innerList, layer);
      innerList.remove(innerList.size() - 1);
    }
  }
}
