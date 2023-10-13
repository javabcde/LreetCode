package dsa;

/**
 * Created by TOM
 * On 2019/11/22 14:56
 */
public class 最小编辑距离 {


  public static void main(String[] args) {
    String str = "Hello World";

    // 使用replace()方法将字符'o'替换为'X'
    String replacedStr = str.replace("o", "X");
    System.out.println(replacedStr);

    String s = new String("1");
    String s2 = "1";
     //生成了2个对象。常量池中的“1” 和 JAVA Heap 中的字符串对象
    s.intern();
    System.out.println(s == s2);

  }
}
