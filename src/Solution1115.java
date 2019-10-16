import java.util.concurrent.Semaphore;

/**
 * Created by TOM
 * On 2019/10/16 18:32
 */
public class Solution1115 {

  private int n;

  private Semaphore semaphore1 = new Semaphore(1);
  private Semaphore semaphore = new Semaphore(0);

  public void foo(Runnable printFoo) throws InterruptedException {

    for (int i = 0; i < n; i++) {
      semaphore1.acquire();
      // printFoo.run() outputs "foo". Do not change or remove this line.
      printFoo.run();
      semaphore.release();
    }
  }

  public void bar(Runnable printBar) throws InterruptedException {

    for (int i = 0; i < n; i++) {
      semaphore.acquire();
      // printBar.run() outputs "bar". Do not change or remove this line.
      printBar.run();
      semaphore1.release();
    }
  }

}
