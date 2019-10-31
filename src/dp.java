import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/**
 * Created by TOM
 * On 2019/10/28 23:25
 */
public class dp {

  public static void main(String[] args) {
    List<BigDecimal> list = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      BigDecimal bigDecimal = new BigDecimal(5.25);
      bigDecimal = bigDecimal.add(BigDecimal.valueOf(i / 2));
      list.add(bigDecimal);
    }
    list.forEach(System.out::println);
    BigDecimal max = new BigDecimal(28);
    List<TreeSet<BigDecimal>> dpList = dp(list, max);
    assert dpList != null;
    dpList.forEach(bigDecimals -> {
      bigDecimals.forEach(bigDecimal -> {
        System.out.print(bigDecimal + " -- ");
      });
      System.out.println();
    });
    //记住结果选那些单
    List<Integer> resultList = new ArrayList<>();
    BigDecimal result = dpList.get(dpList.size() - 1).last();
    for (int i = dpList.size() - 1; i > 0; i--) {
      TreeSet<BigDecimal> preSet = dpList.get(i - 1);
      if (!preSet.contains(result)) {
        resultList.add(i);
        result = result.subtract(list.get(i));
      }
    }
    if (result.compareTo(BigDecimal.ZERO) > 0) {
      resultList.add(0);
    }
    resultList.forEach(integer -> {
      System.out.print(list.get(integer) + " -- ");
    });
  }

  private static List<TreeSet<BigDecimal>> dp(List<BigDecimal> sortOrderList, BigDecimal ableLimit) {
    if (sortOrderList.size() > 0) {
      List<TreeSet<BigDecimal>> list = new ArrayList<>();
      for (int i = 0; i < sortOrderList.size(); i++) {
        //当前订单选择的所有可能
        TreeSet<BigDecimal> curSet = new TreeSet<>();
        TreeSet<BigDecimal> tempSet = new TreeSet<>();
        //第一个订单前面没有结果直接跳过
        if (i > 0) {
          TreeSet<BigDecimal> preSet = list.get(i - 1);
          //前面订单的结果全部保存到当前订单
          preSet.forEach(bigDecimal -> {
            curSet.add(bigDecimal);
            tempSet.add(bigDecimal);
          });
        }
        if (tempSet.size() > 0) {
          for (BigDecimal bigDecimal : tempSet) {
            BigDecimal totalAmount = bigDecimal.add(sortOrderList.get(i));
            if (totalAmount.compareTo(ableLimit) > 0) {
              break;
            }
            curSet.add(totalAmount);
          }
        } else {
          //不要当前单
          curSet.add(BigDecimal.ZERO);
          //要当前单
          curSet.add(sortOrderList.get(i));
        }
        list.add(curSet);
      }
      return list;
    }
    return null;
  }
}
