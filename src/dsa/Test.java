package dsa;

/**
 * Created by TOM
 * On 2020/9/6 14:23
 */
public class Test {


  public static void main(String[] args) {

  }

  /**
   * @param param   长度是2的随机字符
   * @param strings 一个长度是100的字符串数
   * @param result  结果
   */
  private static void test(String param, String[] strings, Integer result) {
    for (String string : strings) {
      if (string.equalsIgnoreCase(param)) {
        result++;
      }
    }
  }

}
