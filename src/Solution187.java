import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TOM
 * On 2021/10/8 23:32
 */
public class Solution187 {

  public static void main(String[] args) {
    List<String> aaaaaaaaaaaaa = findRepeatedDnaSequences("AAAAAAAAAAAAA");
    System.out.println(aaaaaaaaaaaaa);
  }


  public static List<String> findRepeatedDnaSequences(String s) {
    final int l = 10;
    List<String> result = new ArrayList<>();
    Map<String, Integer> temp = new HashMap<>();
    int length = s.length();
    for (int i = 0; i <= length - l; i++) {
      String segment = s.substring(i, i + l);
      temp.put(segment, temp.getOrDefault(segment, 0) + 1);
      if (temp.get(segment) > 1) {
        result.add(segment);
      }
    }
    return result;
  }


}
