import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2021/10/13 21:34
 */
public class Solution412 {


  public List<String> fizzBuzz(int n) {
    List<String> result = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        result.add("FizzBuzz");
      } else if (i % 3 == 0) {
        result.add("Fizz");
      } else if (i % 5 == 0) {
        result.add("Buzz");
      } else {
        result.add(i + "");
      }
    }
    return result;
  }
}
