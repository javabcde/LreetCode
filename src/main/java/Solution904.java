import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by TOM
 * On 2021/10/29 22:13
 */
public class Solution904 {

  private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

  private static Executor executor = Executors.newFixedThreadPool(1);

  public static void main(String[] args) {
    threadLocal.set("main");
    executor.execute(() -> {
      threadLocal.set("son");
      System.out.println("----------");
      threadLocal.get();
    });
    new Thread(() -> {
      threadLocal.set("son2");
      System.out.println("----------");
      threadLocal.get();
    }).start();
    System.out.println("=========");
    threadLocal.get();
    while (true) {

    }

  }


  public int totalFruit(int[] fruits) {

    return 0;
  }
}
